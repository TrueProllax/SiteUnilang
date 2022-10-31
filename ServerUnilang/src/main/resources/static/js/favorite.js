const button = document.getElementById('change-favorite');

button.addEventListener('click', () => {
    
    if (button.innerHTML === "Удалить из избранного") {
        button.innerHTML = "Добавить в избранное";
    } else if (button.innerHTML === "Добавить в избранное") {
        button.innerHTML = "Удалить из избранного";
    }
    
    
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});