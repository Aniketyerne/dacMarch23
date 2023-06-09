// import { sum } from "./calc.js";

// let output = sum(10, 20);
// console.log(output);
import { readFileSync } from "node:fs";

let filePath = "E:\WPT March\node js\package.json";
let fileData = readFileSync(filePath, { encoding: "utf-8" });
console.log(fileData);