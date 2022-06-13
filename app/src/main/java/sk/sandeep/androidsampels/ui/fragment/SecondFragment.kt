package sk.sandeep.androidsampels.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import sk.sandeep.androidsampels.R


class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAG", "SecondFragment: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("TAG", "SecondFragment: onCreateView")

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAG", "SecondFragment: onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("TAG", "SecondFragment: onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "SecondFragment: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "SecondFragment: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "SecondFragment: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "SecondFragment: onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("TAG", "SecondFragment: onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAG", "SecondFragment: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "SecondFragment: onDestroy")
    }
}

/**
 todo : How to Create a list?
 *
fun main() {
val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
println("list:   ${numbers}")
}

 todo: How to create Set?
 a set. It's a group of related items, but unlike a list, there can't be any duplicates, and the
 order doesn't matter. An item can be in the set or not, but if it's in the set, there is only one
 copy of it.


 fun main() {
 val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
 println("list:   ${numbers}")
 println("sorted: ${numbers.sorted()}")

 val setOfNumbers = numbers.toSet()
 println("set:    ${setOfNumbers}")

 val set1 = setOf(1,2,3)
 val set2 = mutableSetOf(3,2,1)
 println("$set1 == $set2: ${set1 == set2}")
 println("contains 7: ${setOfNumbers.contains(7)}")
 }

 list:   [0, 3, 8, 4, 0, 5, 5, 8, 9, 2]
 sorted: [0, 0, 2, 3, 4, 5, 5, 8, 8, 9]
 set:    [0, 3, 8, 4, 5, 9, 2]
 [1, 2, 3] == [3, 2, 1]: true
 contains 7: false

  Todo : how ro Create a Map?
 a map or dictionary. A map is a set of key-value pairs, designed to make it easy to look up a
 value given a particular key. Keys are unique, and each key maps to exactly one value, but the
 values can have duplicates. Values in a map can be strings, numbers, or objects—even another
 collection like a list or a set.

 fun main() {
 val peopleAges = mutableMapOf<String, Int>(
 "Fred" to 30,
 "Ann" to 23
 )
 peopleAges.put("Barbara", 42)
 peopleAges["Joe"] = 51
 println(peopleAges)

 peopleAges.forEach{ map->
    print("${map.key} is ${map.value}")
 }

 {Fred=30, Ann=23, Barbara=42, Joe=51}

 Fred is 31, Ann is 23, Barbara is 42, Joe is 51,


  ToDO:: map() function it is not map of collections
 The map() function (which shouldn't be confused with a map or dictionary collection above) applies
 a transformation to each item in a collection.

 In your program, replace the forEach statement with this line:

 peopleAges.forEach{ map->
 print("${map.key} is ${map.value}")
 }
 println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )

 Run your program and look at the additional results:

 Fred is 31, Ann is 23, Barbara is 42, Joe is 51

  Todo :: Filter in kotlin?
 filter
 Another common operation with collections is to find the items that match a particular condition.
 The filter() function returns the items in a collection that match, based on an expression.

 After the println(), add these lines:

 val filteredNames = peopleAges.filter { it.key.length < 4 }
 println(filteredNames)

 Again note that the call to filter doesn't need parentheses, and it refers to the current item in the list.

 Run your program and look at the additional results:

 {Ann=23, Joe=51}


 fun main() {
 val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
 val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
 .shuffled()
 .take(2)
 .sorted()
 println(filteredWords)
 }
 [balloon, brief]

  TODO:: lambda function?
 A lambda is a function without a name that can be passed as an expression immediately. An example would be { a: Int -> a * 3 }.
 // All examples create a function object that performs upper-casing.
 // So it's a function from String to String

 val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1

 val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2

 val upperCase3 = { str: String -> str.uppercase() }                     // 3

 // val upperCase4 = { str -> str.uppercase() }                          // 4

 val upperCase5: (String) -> String = { it.uppercase() }                 // 5

 val upperCase6: (String) -> String = String::uppercase

 TODO:: Higher Order function?
 A higher-order function means passing a function to another function, or returning a function from another function.

 fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
 return operation(x, y)                                          // 2
 }

 fun sum(x: Int, y: Int) = x + y                                     // 3

 fun main() {
 val sumResult = calculate(4, 5, ::sum)                          // 4
 val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
 println("sumResult $sumResult, mulResult $mulResult")
 }
  * */