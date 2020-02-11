package com.oopwebsite.entity

import com.fasterxml.jackson.annotation.JsonView
import com.oopwebsite.entity.view.View
import javax.persistence.Id

data class LaboratoryWork(
        @JsonView(View.FULL_INFORMATION::class)
        var name:String = "",
        @JsonView(View.FULL_INFORMATION::class)
        var pathToFile:String = "",
        @JsonView(View.FULL_INFORMATION::class)
        var mark:Int = -1){
        @Id
        var id: String = ""
}