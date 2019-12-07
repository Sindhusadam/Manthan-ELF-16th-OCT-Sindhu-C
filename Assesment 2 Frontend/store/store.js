window.onload = function() {

    // Check for LocalStorage support.
    if (localStorage) {
  
      document.getElementById('name').addEventListener('submit', function() {        // Add an event listener for form submissions
        var name = document.getElementById('name').value;      // Get the value of the name field.
        localStorage.setItem('name', name);     // Save the name in localStorage.
       });

       document.getElementById('email').addEventListener('submit', function() {        // Add an event listener for form submissions
        var name = document.getElementById('email').value;      // Get the value of the name field.
        localStorage.setItem('email', name);     // Save the name in localStorage.
       });

       document.getElementById('password').addEventListener('submit', function() {        // Add an event listener for form submissions
        var name = document.getElementById('name').value;      // Get the value of the name field.
        localStorage.setItem('password', name);     // Save the name in localStorage.
       });
       document.getElementById('number').addEventListener('submit', function() {        // Add an event listener for form submissions
        var name = document.getElementById('name').value;      // Get the value of the name field.
        localStorage.setItem('number', name);     // Save the name in localStorage.
       });
    }
  
  }


