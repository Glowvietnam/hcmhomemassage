package com.example.homemassage.data.repository

import com.example.homemassage.data.model.Technician

class TechnicianRepository {
    fun getTechnicians(): List<Technician> {
        return listOf(
            Technician("1", "Linh Nguyen", listOf("Swedish", "Hot Stone"), 4.8f, "", "5 năm kinh nghiệm"),
            Technician("2", "Huy Tran", listOf("Thai Massage"), 4.5f, "", "3 năm kinh nghiệm")
        )
    }
}