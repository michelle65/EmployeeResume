package com.sampleresume.employeeresume

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory=findViewById<Button>(R.id.workHistoryButton)

        workHistory.setOnClickListener {
         var moveToWorkHistory= Intent(getApplicationContext(),WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory )
        }
        // get reference to button
        val buttonCall = findViewById<Button>(R.id.callButton)
        // set on-click listener
        buttonCall.setOnClickListener {
            // your code to perform when the
            // user clicks on the button
            //val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "phonenumber"))
            var phoneUri=Uri.parse("tel:phonenumber")
            var callIntent=Intent(Intent.ACTION_DIAL,phoneUri)
            startActivity(callIntent)
        }
       var emailButton=findViewById<Button>(R.id.emailButton)
       emailButton.setOnClickListener {
           var emailIntent=Intent(Intent.ACTION_SEND)
           emailIntent.setType("plain/text")
           emailIntent.putExtra(Intent.EXTRA_EMAIL,"example@gmail.com")
           emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Nice resume...")
           emailIntent.putExtra(Intent.EXTRA_TEXT,"I really enjoyed your resume...")
           startActivity(emailIntent)
       }
    }
}