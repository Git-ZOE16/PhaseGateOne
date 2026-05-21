random_num = Math.floor(Math.random() * 100)

console.log(random_num)

const prompt = require("prompt-sync")()

count = 0

while(true){

    count+=1
    
    guessNum = prompt("guess a number: ")
    if(guessNum > 100){
        console.log("abort!!!!")
    }
    
    if(guessNum > random_num){
        console.log("higher")
    } else if(guessNum < random_num){
        console.log("lower")
    } else if(guessNum == random_num){
        console.log("correct")
        break
    }
    
    
    if(count == 5){
        console.log(trials exceeded, no of tries is ${count})
        break
    }
    
}
