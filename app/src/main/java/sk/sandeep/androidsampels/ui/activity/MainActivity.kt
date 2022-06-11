package sk.sandeep.androidsampels.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import sk.sandeep.androidsampels.R
import sk.sandeep.androidsampels.databinding.ActivityMainBinding

/**
 *
 * TODO:: What is Activity?
 * An activity is an crucial android component that represents a single screen
 * with a user interface just like window or frame of Java. Android activity is
 * the subclass of ContextThemeWrapper class.
 *
 * TODO: How Configure Activity in Manifest?
 * Configuring Activity in the manifest
 *
<manifest ... >
<application ... >
<activity
android:name=".ui.activity.MainActivity"
android:exported="true">
<intent-filter>
<action android:name="android.intent.action.MAIN" />

<category android:name="android.intent.category.LAUNCHER" />
</intent-filter>
</activity>
...
</application ... >
...
</manifest >


Intent filters are a very powerful feature of the Android platform. They provide
the ability to launch an activity based not only on an explicit request , but also
an implicit one. For example, an explicit request might tell the system to “Start
the Send Email activity in the Gmail app". By contrast, an implicit request tells
the system to “Start a Send Email screen in any activity that can do the job."
When the system UI asks a user which app to use in performing a task, that’s an
intent filter at work.
 * */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    /** TODO : Activity lifecycle
     * 1.onCreate()
     * 2.onStart()
     * 3.onResume()
     * 4.onPause()
     * 5.onStop()
     * 6.onDestroy() */

    /**TODO: onCreate
     * You must implement this callback, which fires when the system first creates
     * the activity. On activity creation, the activity enters the Created state.
     * In the onCreate() method, you perform basic application startup logic that
     * should happen only once for the entire life of the activity. For example,
     * your implementation of onCreate() might bind data to lists, associate the
     * activity with a ViewModel, and instantiate some class-scope variables. This
     * method receives the parameter savedInstanceState, which is a Bundle object
     * containing the activity's previously saved state. If the activity has never
     * existed before, the value of the Bundle object is null.
     * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnMain.setOnClickListener {

            /**
             * TODO: How To Send Data from one Activity to another Activity?
             * */
            val sendIntent = Intent(this, SecondActivity::class.java).apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
                putExtra("name", "sandeep")
            }

//            button.setOnClickListener {
//                val intent = Intent(this,SecondActivity::class.java);
//                var userName = username.textø
//                var password = password_field.text
//                intent.putExtra("Username", userName)
//                intent.putExtra("Password", password)
//                startActivity(intent);
//            }


//            var strUser: String = intent.getStringExtra("Username")
//            var strPassword: String = intent.getStringExtra("Password")
//            user_name.setText("Seelan")
//            passwor_print.setText("Seelan")

            startActivity(sendIntent)
        }

        Log.d("TAG", "MainActivity: onCreate ")
    }

    /** TODO: OnStart()
     * Your activity does not reside in the Created state. After the onCreate()
     * method finishes execution, the activity enters the Started state, and the
     * system calls the onStart() and onResume() methods in quick succession.
     *
     * When the activity enters the Started state, the system invokes this
     * callback. The onStart() call makes the activity visible to the user, as the
     * app prepares for the activity to enter the foreground and become interactive
     * . For example, this method is where the app initializes the code that
     * maintains the UI.
     * */
    override fun onStart() {
        super.onStart()
        Log.d("TAG", "MainActivity: onStart ")
    }

    /** TODO: onResume()
     *The onStart() method completes very quickly and, as with the Created state,
     * the activity does not stay resident in the Started state. Once this callback
     * finishes, the activity enters the Resumed state, and the system invokes the
     * onResume() method.
     *
     * When the activity enters the Resumed state, it comes to the foreground, and
     * then the system invokes the onResume() callback. This is the state in which
     * the app interacts with the user. The app stays in this state until something
     * happens to take focus away from the app. Such an event might be, for instance,
     * receiving a phone call, the user’s navigating to another activity, or the device
     * screen’s turning off.
     * */

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "MainActivity:  onResume")
    }

    /** TODO: OnPause():
     * When an interruptive event occurs, the activity enters the Paused state, and
     * the system invokes the onPause() callback.
     *
     * The system calls this method as the first indication that the user is leaving
     * your activity (though it does not always mean the activity is being destroyed);
     * it indicates that the activity is no longer in the foreground (though it may
     * still be visible if the user is in multi-window mode). Use the onPause() method
     * to pause or adjust operations that should not continue (or should continue in
     * moderation) while the Activity is in the Paused state, and that you expect to
     * resume shortly. There are several reasons why an activity may enter this state.
     * For example:

    1. Some event interrupts app execution, as described in the onResume() section. This
    is the most common case.
    2. In Android 7.0 (API level 24) or higher, multiple apps run in multi-window mode.
    Because only one of the apps (windows) has focus at any time, the system pauses
    all of the other apps.
    3. A new, semi-transparent activity (such as a dialog) opens. As long as the
    activity is still partially visible but not in focus, it remains paused.
     * */
    override fun onPause() {
        super.onPause()
        Log.d("TAG", "MainActivity: onPause ")
    }

    /** TODO: onStop():
     * If the activity becomes completely invisible, the system calls onStop()
     *
     * When your activity is no longer visible to the user, it has entered the Stopped
     * state, and the system invokes the onStop() callback. This may occur, for example,
     * when a newly launched activity covers the entire screen. The system may also
     * call onStop() when the activity has finished running, and is about to be
     * terminated.
     * */
    override fun onStop() {
        super.onStop()
        Log.d("TAG", "MainActivity: onStop")
    }

    /** TODO: omDestroy()
     * From the Stopped state, the activity either comes back to interact with the user, or the activity is finished running and goes away. If the activity comes back, the system invokes onRestart(). If the Activity is finished running, the system calls onDestroy().
     *
     * onDestroy() is called before the activity is destroyed. The system invokes
     * this callback either because:
    1.the activity is finishing (due to the user completely dismissing the activity
    or due to finish() being called on the activity)
    2.the system is temporarily destroying the activity due to a configuration
    change (such as device rotation or multi-window mode)
     * */
    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "MainActivity: onDestroy")
    }
}
/** TODO : lifecycle call backs when one activity start?
 *  1. onCreate  2. onStart  3.onResume */
/** TODO : lifecycle call backs when one activity start and we press Home Button?
 *  1. onCreate  2. onStart  3.onResume  || 4.onPause 5.onStop*/
/** TODO : lifecycle call backs when one activity start and we press Home Button then come back to screen?
 *  1. onCreate  2. onStart  3.onResume  || 4.onPause 5.onStop || 6.onStart  7.OnResume*/
/** TODO : lifecycle call backs when one activity start and we press overView Button?
 *  1. onCreate  2. onStart  3.onResume  [nothing else happen]*/
/** TODO : lifecycle call backs when one activity start and we press overView Button then come back to screen?
 *  1. onCreate  2. onStart  3.onResume  [nothing else happen]*/
/** TODO : lifecycle call backs when one activity  start and we press back button?
 *  1. onCreate  2. onStart  3.onResume ||  4.onPause 5.onStop */
/** TODO : lifecycle call backs when one activity  start and we press back button and then come back to screen?
 *  1. onCreate  2. onStart  3.onResume ||  4.onPause 5.onStop || 6.onStart  7.onResume*/
/** TODO: lifecycle call backs when one activity  go to another activity?
 *Ans:
1. MainActivity: onCreate
2. MainActivity: onStart
3. MainActivity:  onResume
4. MainActivity: onPause
5. SecondActivity: onCreate
6. SecondActivity: onStart
7. SecondActivity: onResume
8. MainActivity: onStop
 **/

/** TODO: lifecycle call backs when one activity  go to another activity and then go back to first activity?
 *Ans:
1. MainActivity: onCreate
2. MainActivity: onStart
3. MainActivity:  onResume
============================
4. MainActivity: onPause
5. SecondActivity: onCreate
6. SecondActivity: onStart
7. SecondActivity: onResume
8. MainActivity: onStop
============================
9. SecondActivity: onPause
10.MainActivity: onCreate
11.MainActivity: onStart
12.MainActivity: onResume
13.SecondActivity: onStop
 **/