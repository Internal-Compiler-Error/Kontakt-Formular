function objectifyForm(formArray) {//serialize data function
    var returnArray = {};
    for (var i = 0; i < formArray.length; i++) {
        returnArray[formArray[i]['name']] = formArray[i]['value'];
    }
    return returnArray;
}


function submitJSON() {
    var json = objectifyForm($("#contact").serializeArray());
    json = JSON.stringify(json);


    $.ajax("/form", {
        data: json,
        contentType: 'application/json',
        type: 'POST'
    });
}

function submitForm(e) {
    e.preventDefault();
    submitJSON();
    return false;
}