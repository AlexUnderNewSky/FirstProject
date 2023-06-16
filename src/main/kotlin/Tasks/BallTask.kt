/*Магический шар
Постановка задачи: Разработать программу, которая будет как "магически" шар выдавать случайный результат. К примеру, вы ей задаете вопрос: "..... . .. ... .. ?", а она выдает вам результат из предложенного:

Да
Нет
Скорее всего да
Скорее всего нет
Возможно
Имеются перспективы
Вопрос задан неверно
По желанию дополнить ответами.*/

package Tasks

class BallTask {

    fun Ball() {
        println("Hi, i'm a magic ball!")
        println("Ask me a question.")
        val words = arrayOf("Yes.", "No.", "Most likely yes.", "Probably not.", "Perhaps.", "There are prospects.", "The question is not asked correctly.", "FK you c:")
        val randomWord = words.random()
        val question = readln()
        if(question.contains('?'))
            println(randomWord)
        else
            println("It's not a question")
    }
}