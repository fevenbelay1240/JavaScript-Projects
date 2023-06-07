
const getUserChoice = userInput => {
userInput = userInput.toLowerCase()
if(userInput === 'rock' ||  userInput === 'paper'||userInput === 'scissors')
{
  return userInput
}
else{
  console.log('error')
}
};
console.log(getUserChoice('me'))
function getComputerChoice(){
num = Math.floor(Math.random() *3)
switch (num) {
   case 0:
      return 'rock'
      break
   case 1:
     return 'paper'
     break
   case 2:
     return 'scissors'
     break
   }
}
console.log(getComputerChoice())
function determineWinner(userChoice, computerChoice){
  if(userChoice === computerChoice){
    return 'Tie'
  }
  if(userChoice === 'rock'){
    if(computerChoice === 'paper'){
      return 'computer won'
    }else{
      return 'user won'
    }
  }if(userChoice === 'paper'){
    if(computerChoice === 'scissors'){
      return 'computer won'
    }else{
      return 'user won'
    }
  }if(userChoice === 'scissors'){
    if(computerChoice === 'rock'){
      return 'computer won'
    }else{
      return 'user won'
    }
  }
}
console.log(determineWinner(getUserChoice('rock'), getComputerChoice()))

function playGame(){
 const userChoice = getUserChoice('rock')
  const computerChoice = getComputerChoice()
  console.log("You threw: " + userChoice) 
  console.log("Computer choice: " + computerChoice)
  console.log("winner: " +determineWinner(userChoice, computerChoice))
}
playGame()
