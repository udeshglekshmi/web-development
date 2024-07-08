<?php
$word="June"; 
switch($word){
    case "May": 
        echo "___"; 
        break; 
    case "June": 
        echo "\"June to ";
    case "July": 
    case "August": 
    case "September": 
    case "October": 
    case "November": 
    case "December":   
        echo "December "; 
    default:
        echo "and then new year\""; 
}