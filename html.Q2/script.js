function validateForm() {
    let firstName = document.getElementById("firstName").value;
    let lastName = document.getElementById("lastName").value;
    let profession = document.getElementById("profession").value;
    let email = document.getElementById("email").value;
    let mobile = document.getElementById("mobile").value;
    let dob = document.getElementById("dob").value;
    let country = document.getElementById("country").value;
    let genderElements = document.querySelectorAll('input[name="gender"]:checked');

   
    if (genderElements.length === 0) {
        alert("Please select your gender.");
        return false;
    }

    let popup = "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Date of Birth: " + dob + "\n" +
                "Country: " + country + "\n" +
                "Gender: " + Array.from(genderElements).map(el => el.value).join(", ") + "\n" +
                "Profession: " + profession + "\n" +
                "Email: " + email + "\n" +
                "Mobile Number: " + mobile;

    alert(popup);

    resetForm();

    return false; 
}

function resetForm() {
    document.getElementById("surveyForm").reset();
}