package com.example.homemassage.viewmodel

import androidx.lifecycle.*
import com.example.homemassage.data.model.Technician
import com.example.homemassage.data.repository.TechnicianRepository
import kotlinx.coroutines.launch

class TechnicianViewModel : ViewModel() {
    private val repository = TechnicianRepository()
    private val _technicians = MutableLiveData<List<Technician>>()
    val technicians: LiveData<List<Technician>> = _technicians

    fun fetchTechnicians() {
        viewModelScope.launch {
            _technicians.value = repository.getTechnicians()
        }
    }
}