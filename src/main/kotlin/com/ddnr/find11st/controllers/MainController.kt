package com.ddnr.find11st.controllers

import com.ddnr.find11st.ProductSearchResponse
import com.ddnr.find11st.api.API11stManager
import com.github.thomasnield.rxkotlinfx.toObservable
import com.jfoenix.controls.JFXButton
import com.jfoenix.controls.JFXTextField
import io.reactivex.rxkotlin.toObservable
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.Parent
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.net.URL
import java.util.*
import java.util.concurrent.TimeUnit
import javafx.scene.Scene
import javafx.scene.control.Control
import javafx.stage.Stage
import javafx.stage.Window

fun Node.getWindow(): Window {
    return this.scene.window
}

fun Control.getStage(): Window {
    return this.getWindow()
}

open class MainController : AbsController<String>() {
    override fun changeScene(fxml: String, control: Control?) {
        //https://www.programcreek.com/java-api-examples/?api=javafx.stage.Stage
        //http://bitsoul.tistory.com/66
        val loader = FXMLLoader();
        val page = loader.load<Any>(javaClass.getResource("/com/ddnr/find11st/" + fxml).openStream()) as Parent
        val resultScene = Scene(page)
        val stage: Stage = control?.getStage() as Stage

        stage?.apply {
            scene = resultScene
            val controller = loader.getController<Any>() as AbsController<Any>
            controller.data = MainController::data
            show()
        }
    }

    @FXML
    override fun initialize(location: URL?, resources: ResourceBundle?) {
        searchTextFiled?.apply {
            textProperty().toObservable()
                    //.debounce(500, TimeUnit.MILLISECONDS)
                    .throttleLast(500, TimeUnit.MILLISECONDS)
                    .subscribe {
                        println("${it}")
                    }

            setOnAction {
                changeScene("search_result.fxml", this)
            }
        }

        searchButton?.apply {
            setOnAction {
                changeScene("search_result.fxml", this)
            }
        }
    }

    @FXML private var searchButton: JFXButton? = null

    @FXML private var searchTextFiled: JFXTextField? = null
}