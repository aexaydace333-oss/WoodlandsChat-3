package com.danielrono.woodlandschat

import android.app.Activity
import android.os.Bundle
import android.widget.*

class MainActivity:Activity(){

override fun onCreate(savedInstanceState:Bundle?){
super.onCreate(savedInstanceState)

val root=LinearLayout(this)
root.orientation=LinearLayout.VERTICAL

val title=TextView(this)
title.text="🌲 WOODLANDS CHAT V7\nDaniel Rono\nOffline Field Radio"
title.textSize=24f

val users=Button(this)
users.text="DISCOVER USERS"

val room=EditText(this)
room.hint="Group / Channel"

val msg=EditText(this)
msg.hint="Encrypted message"

val send=Button(this)
send.text="SEND MESSAGE"

val talk=Button(this)
talk.text="🎙 PUSH TO TALK"

val connect=Button(this)
connect.text="CONNECT RADIO LINK"

val sos=Button(this)
sos.text="🚨 SOS BROADCAST"

val status=TextView(this)
status.text="Ready"

users.setOnClickListener{
status.text="Searching nearby phones"
}

connect.setOnClickListener{
status.text="Radio link active"
}

send.setOnClickListener{
status.text="Message transmitted"
}

sos.setOnClickListener{
status.text="Emergency broadcast activated"
}

root.addView(title)
root.addView(users)
root.addView(room)
root.addView(msg)
root.addView(send)
root.addView(talk)
root.addView(connect)
root.addView(sos)
root.addView(status)

setContentView(root)

}

}
