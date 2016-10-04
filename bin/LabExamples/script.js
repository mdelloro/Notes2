$(document).ready(function() {
	$("#add-todo-form").submit(function(event) {
		event.preventDefault();
		addTodo();
	});
	
	function addTodo() {
		var descriptionInput = $('[name="description"]');
		var description = descriptionInput.val();
		descriptionInput.val('');
		
		addToList(description);
		descriptionInput.focus();
	}
	
	function addToList(description) {
		var listItem = document.createElement('li');
		$(listItem).append(document.createTextNode(description));
		
		$(listItem).hide();
		$("#list").append(listItem);
		$(listItem).slideDown();
	}
});