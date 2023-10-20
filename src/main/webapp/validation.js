//create code to validate input fields to be in lowercase
function validateForm() {
    var x = document.forms["myForm"]["fname"].value;
    if (x != x.toLowerCase()) {
        alert("Name must be in lowercase");
        return false;
    }

}

// Path: src/main/webapp/validation.js
//create code to validate that user is from India
function validateForm() {
    var x = document.forms["myForm"]["country"].value;
    if (x != "India") {
        alert("You must be from India");
        return false;
    }

}

//validation to check user internet address is from asia region
function validateForm() {
    var x = document.forms["myForm"]["internetaddress"].value;
    if (x != "Asia") {
        alert("You must be from Asia");
        return false;
    }

}