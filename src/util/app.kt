
    package util

    import javax.swing.JFrame

    private const val `My Identifier 1$` :String = "Test Identifier"
    private const val TEST_APP :String = "Test App"

    fun main()
    // fun main( args: Array<String> )
    {
        var frame = JFrame()
        frame.setTitle( "Mein Fenster" )
        frame.setVisible( true )


        var t : HashMap<String, String> = HashMap<String, String>()

        // var x = t.get( "iwas" )



        var matthias = 7

        var benjamin :CharSequence = "test"

        var benjamin2 = 7.3


//        var test6 : MutableList<String> = MutableList()

//        test6 = "test7"

val strings  : MutableList<String> = mutableListOf("Anne", "Karen", "Peter")
val strings2 : List<String> = listOf("Anne", "Karen", "Peter")

strings.dropLast(  0 )
strings.add( "test" )

strings2.dropLast( 0 )


 for ( i in 0..10 )

// for ( val i = 0; i < 10; ++i )
{
    println( i )
}



var testA :String  = ""
var testB :String? = null

testA = "sddopskosd"

testB = null
testB = "dssdds"
//testB = null

    println( "Anzahl Zeichen: " + testB.substring( 0..5 ) )





// benjamin += java.lang.String.valueOf( 1 )
// benjamin = "test2"


// println( benjamin )



        println( "Hello Kotlin from util.util.main" )

        var number = 42
        var message = "Hello"

        var number2:Int = 42
        var message2:String = "Hello"

        // constants
        val NUMBER3:Int = 42
        val MESSAGE3:String = "Hello"

        number2 = 7

        println( number2 )
        println( MESSAGE3 )

        val x: String
        x = "My Value X"

        println(`My Identifier 1$`)

        val test2 = Test()
        test2.testMain()

    }
