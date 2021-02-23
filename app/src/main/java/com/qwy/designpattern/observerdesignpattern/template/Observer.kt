package com.qwy.designpattern.observerdesignpattern.template

import android.os.Message

interface Observer {
    fun update(message: Message)
}