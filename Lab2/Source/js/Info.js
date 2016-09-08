

//This will store the UserInfo
//Registration Page
function store () {
    var inputFname= document.getElementById("fname");
    var inputLname= document.getElementById("lname");
    var inputEmail= document.getElementById("email");
    var inputPassword= document.getElementById("password");
    localStorage.setItem("fname", inputFname.value);
    localStorage.setItem("lname", inputLname.value);
    localStorage.setItem("email", inputEmail.value);
    localStorage.setItem("password", inputPassword.value);
}

//Login Page
function login() {
    var localEmail = localStorage.getItem("email");
    var localPassword = localStorage.getItem("password");
    var localFname = localStorage.getItem("fname");
    var localLname = localStorage.getItem("lname");

    var inputEmail = document.getElementById("email");
    var inputPassword = document.getElementById("password");


    if((localEmail == inputEmail.value)&&(localPassword==inputPassword.value))
    {
        window.alert('Welcome '+localFname+' '+localLname+' '+'to Home Page');
        window.location.replace("Home_Page.html");
    }

    else

    {
        window.alert("Invalid Email and Password");

    }
    return false;
}

