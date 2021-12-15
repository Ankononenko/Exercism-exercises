object Bob {
    fun hey(input: String): String {
        var stringToReturn = String()
        // Here we create a variable with no white space, called inputNoWC.
        // It is needed to get around cases like "Is that all?    "
        val inputNoWC = input.replace("\\s".toRegex(), "")

        if (inputNoWC.isBlank()) {
            stringToReturn = "Fine. Be that way!"
        }
        else if (inputNoWC.last() == '?' && inputNoWC.uppercase() != inputNoWC) {
            stringToReturn = "Sure."
        }
        // The statement below s=is needed for cases like "4?" and "!@#?". The are questions that need "Sure" answer.
        // We check if the last char is question mark and remove all special characters and punctuation to see if it is all that is in the string.
        else if (inputNoWC.last() == '?' && inputNoWC.replace("[^a-zA-Z]".toRegex(), "").isEmpty()) {
            stringToReturn = "Sure."
        }
        else if (inputNoWC.last() == '?' && inputNoWC.uppercase() == inputNoWC
            // Here we get rid of special characters and all the punctuation to get around cases like "4?"
            //from falling into this category
            && inputNoWC.replace("[^a-zA-Z]".toRegex(), "").isNotEmpty()) {
            stringToReturn = "Calm down, I know what I'm doing!"
        }
        else if (inputNoWC.uppercase() == inputNoWC && inputNoWC.isNotBlank() && inputNoWC.last() != '?'
            // Here we get rid of special characters and all the punctuation to get around cases like "4?"
            //from falling into this category
            && inputNoWC.replace("[^a-zA-Z]".toRegex(), "").isNotEmpty()) {
            stringToReturn = "Whoa, chill out!"
        }
        else {
            stringToReturn = "Whatever."
        }

        println(inputNoWC)
        return stringToReturn
    }
}
fun main () {
    val callBob = Bob
    println(callBob.hey("WHAT THE HELL WERE YOU THINKING?"))
}
