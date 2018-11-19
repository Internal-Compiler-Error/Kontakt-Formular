function objectifyForm(formArray) {
    var returnArray = {};
    for (var i = 0; i < formArray.length; i++) {
        returnArray[formArray[i]['name']] = formArray[i]['value'];
    }
    return returnArray;
}


function submitJSON(evt) {
    var target = evt.target;
    var json = objectifyForm(target);
    json = JSON.stringify(json);
    $.ajax("/form", {
        data: json,
        contentType: 'application/json',
        type: 'POST'
    });
    return false;
}

var contactForm = document.getElementById("contact-form")
contactForm.addEventListener('submit', function (evt) {
    evt.preventDefault();
    submitJSON(evt);
}, false);