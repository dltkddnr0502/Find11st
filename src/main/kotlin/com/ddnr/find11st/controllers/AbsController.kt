package com.ddnr.find11st.controllers

import javafx.fxml.Initializable
import javafx.scene.control.Control
import java.net.URL
import java.util.*


abstract class AbsController <T> : Initializable {
    override fun initialize(location: URL?, resources: ResourceBundle?) {

    }

    var data: T?=null
        set(value: T?){
            println("setting data: ${value}")
            field = value
        }

    abstract fun changeScene(fxml: String, control: Control?)
}