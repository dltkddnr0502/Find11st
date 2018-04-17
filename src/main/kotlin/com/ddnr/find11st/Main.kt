package com.ddnr.find11st

import com.ddnr.find11st.controllers.AbsController
import javafx.application.Application
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.JavaFXBuilderFactory
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Screen
import javafx.stage.Stage

class Main : Application() {
    var controller: AbsController<Any>? = null

    override fun start(primaryStage: Stage?) {
        val root = FXMLLoader.load<Parent>(javaClass.getResource("/com/ddnr/find11st/main.fxml"))
        primaryStage?.apply {
            title = "Hello World KT"
            scene = Scene(root)
            show()
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Application.launch(Main::class.java)
        }
    }
}