//first calculate the amount of hours i sleep every night
const getSleepHours = day => {
  switch(day){
    case "monday":
      return 1;
    case "tuesday":
      return 1;
    case "wednesday":
      return 1;
    case "thursday":
      return 1;
    case "friday":
      return 1;
    case "saturday":
      return 1;
    case "sunday":
      return 1;
  }

};  console.log(getSleepHours("saturday"));

const getActualSleepHours = () => {
let sum = getSleepHours("monday")+getSleepHours("tuesday")+getSleepHours("wednesday")+getSleepHours("thursday")+getSleepHours("friday")+getSleepHours("sunday")+getSleepHours("saturday")
return sum
};
console.log(getActualSleepHours());
const getIdealSleepHours = () => {
  let idealHours = 8
  return idealHours * 7
};
console.log(getIdealSleepHours());

const calculateSleepDebt =() => {
let actualSleepHours = getActualSleepHours()
let idealSleepHours = getIdealSleepHours()

  if (actualSleepHours === idealSleepHours){
    console.log("perfect amount of sleep")
  }else if (actualSleepHours > idealSleepHours){
    console.log("more sleep by: ")
    console.log(actualSleepHours - idealSleepHours)
  }else if (actualSleepHours < idealSleepHours){
    console.log("less sleep by: ")
      console.log(idealSleepHours -actualSleepHours )
  }
};
calculateSleepDebt()
