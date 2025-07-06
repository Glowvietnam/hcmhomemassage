package com.example.homemassage.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.homemassage.data.model.Technician
import com.example.homemassage.viewmodel.TechnicianViewModel

@Composable
fun HomeScreen(viewModel: TechnicianViewModel) {
    val technicians by viewModel.technicians.observeAsState(listOf())

    LazyColumn {
        items(technicians) { technician ->
            TechnicianCard(technician)
        }
    }
}

@Composable
fun TechnicianCard(tech: Technician) {
    Card(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = tech.name, style = MaterialTheme.typography.h6)
            Text(text = "Rating: ${tech.rating}", style = MaterialTheme.typography.body2)
            Text(text = tech.skills.joinToString(), style = MaterialTheme.typography.body2)
        }
    }
}