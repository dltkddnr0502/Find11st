package com.ddnr.find11st.controllers

import com.ddnr.find11st.Product
import com.jfoenix.controls.JFXListView
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Control
import java.net.URL
import java.util.*

class ResultController : AbsController<Product>() {
    override fun changeScene(fxml: String, control: Control?) {

    }

    @FXML
    val listView: JFXListView<Product>? = null

    @FXML
    fun initialize() {
    }

    @FXML
    override fun initialize(location: URL?, resources: ResourceBundle?) {

    }

}