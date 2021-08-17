package com.mohamed_medhat.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.mohamed_medhat.myapplication.model.User

// TODO temp user
//User("", "", "", "", "Medhat", 1, "Mohamed", "")

//@Composable
//fun MainScreen() {
//    Column {
//        WorkshopAppBar()
//        UsersHeader()
//        // TODO replace with a list.
//        UserCard(
//            user = User(
//                "https://i.imgur.com/SR04reG_d.webp",
//                "Egypt",
//                "1000",
//                "Male",
//                "Medhat",
//                1,
//                "Mohamed",
//                "mmedhat@instabug.com"
//            )
//        )
//    }
//}
//
//@Composable
//fun UsersHeader() {
//    Column {
//        Row(
//            modifier = Modifier
//                .padding(start = 16.dp, top = 16.dp)
//                .fillMaxWidth()
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.ic_people),
//                contentDescription = null
//            )
//            Text(text = "Users")
//        }
//        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
//            Divider(
//                thickness = 2.dp,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(horizontal = 16.dp)
//            )
//        }
//    }
//}
//
//// TODO Implement the expanding animation.
//@Composable
//fun UserCard(user: User) {
//    Card(
//        elevation = 4.dp,
//        modifier = Modifier
//            .padding(start = 16.dp, top = 8.dp, bottom = 8.dp, end = 16.dp)
//            .fillMaxWidth()
//    ) {
//        Row {
//            Image(
//                painter = rememberImagePainter(data = user.image, builder = {
//                    transformations(CircleCropTransformation())
//                }), contentDescription = null,
//                modifier = Modifier
//                    .padding(all = 16.dp)
//                    .size(48.dp)
//            )
//            Text(
//                text = "${user.firstName} ${user.lastName}",
//                style = MaterialTheme.typography.body1,
//                modifier = Modifier.padding(top = 16.dp)
//            )
//        }
//    }
//}
//
//@Composable
//fun WorkshopAppBar() {
//    TopAppBar {
//        Text(
//            text = "Compose Workshop",
//            color = Color.White,
//            modifier = Modifier.padding(start = 16.dp)
//        )
//        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
//            Image(
//                painter = painterResource(id = R.drawable.ic_download),
//                contentDescription = null,
//                modifier = Modifier.padding(16.dp)
//            )
//        }
//    }
//}



// TODO Users Header
//@Composable
//fun UsersHeader() {
//    Column {
//        Row(
//            modifier = Modifier
//                .padding(start = 16.dp, top = 16.dp)
//                .fillMaxWidth()
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.ic_people),
//                contentDescription = null
//            )
//            Text(text = "Users")
//        }
//        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
//            Divider(
//                thickness = 2.dp,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(horizontal = 16.dp)
//            )
//        }
//    }
//}