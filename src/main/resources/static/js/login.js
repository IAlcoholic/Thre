
var obj=JSON.parse(localStorage.getItem("thre_user"));
 if (obj == null) {
 	window.location.href="login.html"
 }
function exit () {
	   localStorage.removeItem('thre_user');
}