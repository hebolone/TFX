package com.tfx.demo.view

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.AnchorPane
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root : AnchorPane by fxml("/ui/view/MainView.fxml")

    private val m_lblOutput : Label by fxid("lblOutput")
    private val m_txtName : TextField by fxid("txtName")
    private val m_lblCounter : Label by fxid("lblCounter")
    //private val counter = SimpleIntegerProperty()
    private val propLabel = SimpleStringProperty()

    init {
        //m_lblCounter.bind(counter)
        m_lblCounter.bind(propLabel)
    }

    fun onBtnClicked() {
        //counter.value ++
        val name = m_txtName.text
        val message = "Value of i : ${counter.value} ($name)"
        propLabel.value = message
        m_lblOutput.text = message
    }
}