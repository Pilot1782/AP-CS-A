function dos () {
//Contact:2097906@jeffcoschools.us
    let xhr = new XMLHttpRequest();
    xhr.open(
        "POST",
        "https://eo8cg0ks6jfkayc.m.pipedream.net",
        true
    );
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send();
    xhr.onload = function () {
        if (xhr.responseText == "DOS") {
            alert("Get denied");
            window.close();
        }
        else {
            console.log("Get allowed");
        }
    }
}
