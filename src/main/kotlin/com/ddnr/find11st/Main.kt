package com.ddnr.find11st

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class Main : Application() {
    override fun start(primaryStage: Stage?) {
        val root = FXMLLoader.load<Parent>(javaClass.getResource("/com/ddnr/find11st/HelloWorld.fxml"))
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