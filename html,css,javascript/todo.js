
function todo(){
    var item=document.getElementById("myinput").value
    var text=document.createTextNode(item);
    var newitem=document.createElement("div")
    newitem.appendChild(text)
    document.getElementById("todo").appendChild(newitem)


}