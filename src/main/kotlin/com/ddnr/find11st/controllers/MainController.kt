package com.ddnr.find11st.controllers

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.scene.control.Label
import java.net.URL
import java.util.*

class MainController : Initializable {
    override fun initialize(location: URL?, resources: ResourceBundle?) {

    }

    @FXML private val helloWorldButton: Button? = null
    @FXML private val goodByeWorldButton: Button? = null
    @FXML private val label: Label? = null

    @FXML
    private fun displayHelloWorld() {
        label?.text = "Hello World"
        helloWorldButton?.isVisible = false
        goodByeWorldButton?.isVisible = goodByeWorldButton?.isVisible ?: false
    }

    @FXML
    private fun goodByeWorld() {
        label?.text = ""
        goodByeWorldButton?.isVisible = false
        helloWorldButton?.isVisible = helloWorldButton?.isVisible ?: false
    }
}