document.getElementById("contactForm").addEventListener("submit", function(event) {
    event.preventDefault();

    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let message = document.getElementById("message");

    if (name === "" || email === "") {
        message.style.color = "red";
        message.textContent = "Please fill in all fields.";
        return;
    }

    // Simple email validation
    if (!email.includes("@") || !email.includes(".")) {
        message.style.color = "red";
        message.textContent = "Enter a valid email address.";
        return;
    }

    message.style.color = "green";
    message.textContent = "Form submitted successfully!";
});