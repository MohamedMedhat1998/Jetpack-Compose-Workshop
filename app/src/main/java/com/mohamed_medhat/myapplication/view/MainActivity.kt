package com.mohamed_medhat.myapplication.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.mohamed_medhat.myapplication.R
import com.mohamed_medhat.myapplication.model.User
import com.mohamed_medhat.myapplication.ui.theme.JetpackComposeWorkshopTheme

class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeWorkshopTheme {
                MainScreen()
            }
        }
    }
}

@ExperimentalAnimationApi
@Composable
fun MainScreen() {
    Column {
        WorkshopAppBar()
        UsersHeader()
        UsersList()
    }
}

@ExperimentalAnimationApi
@Composable
fun UsersList(viewModel: MainActivityViewModel = viewModel()) {
    val usersList = viewModel.usersList.observeAsState(mutableListOf())
    LazyColumn {
        items(usersList.value) { item ->
            UserCard(user = item)
        }
    }
}
@Composable
fun UsersHeader() {
    Column {
        Row(
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_people),
                contentDescription = null
            )
            Text(text = "Users")
        }
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
            Divider(
                thickness = 2.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )
        }
    }
}

// TODO Implement the expanding animation.
@ExperimentalAnimationApi
@Composable
fun UserCard(user: User) {
    var isSelected by rememberSaveable {
        mutableStateOf(false)
    }
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .padding(start = 16.dp, top = 8.dp, bottom = 8.dp, end = 16.dp)
            .fillMaxWidth()
            .clickable {
                isSelected = !isSelected
            }
    ) {
        Row {
            Image(
                painter = rememberImagePainter(data = user.image, builder = {
                    transformations(CircleCropTransformation())
                }), contentDescription = null,
                modifier = Modifier
                    .padding(all = 16.dp)
                    .size(48.dp)
            )
            Column {
                Text(
                    text = "${user.firstName} ${user.lastName}",
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(top = 16.dp)
                )
                AnimatedVisibility(visible = isSelected) {
                    Column() {
                        Text(
                            text = user.email,
                            style = MaterialTheme.typography.caption,
                            modifier = Modifier.padding(top = 16.dp)
                        )
                        Text(
                            text = user.salary,
                            style = MaterialTheme.typography.caption,
                            modifier = Modifier.padding(top = 16.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun WorkshopAppBar(viewModel: MainActivityViewModel = viewModel()) {
    TopAppBar {
        Text(
            text = "Compose Workshop",
            color = Color.White,
            modifier = Modifier.padding(start = 16.dp)
        )
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
            Image(
                painter = painterResource(id = R.drawable.ic_download),
                contentDescription = null,
                modifier = Modifier
                    .padding(16.dp)
                    .clickable {
                        viewModel.loadUsers()
                    }
            )
        }
    }
}
@ExperimentalAnimationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeWorkshopTheme {
        MainScreen()
    }
}