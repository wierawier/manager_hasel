
const generateButton = document.querySelector('button.generate');


function generatePassword() {
    fetch('http://localhost:8080/generate')
     .then(response => {
         if (!response.ok) {
           throw new Error(`Bląd! status: ${response.status}`);
         }
         return response.json();
       })
       .then(data => {
         const outputInput = document.getElementById('password');
         if (outputInput) {
              outputInput.value = data.password;
         }
       })
       .catch(error => {
         console.error('Bląd', error);
       });

}


generateButton.addEventListener('click', generatePassword)