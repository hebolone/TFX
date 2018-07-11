package com.tfx.demo.view

import javafx.scene.control.Label
import javafx.scene.layout.AnchorPane
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root : AnchorPane by fxml("/ui/view/MainView.fxml")

    private var i = 0
    private val lblOutput : Label by fxid(/*"lblOutput"*/)

    fun onBtnClicked() {
        i ++
        lblOutput.text = "Value of i : $i"
    }
}