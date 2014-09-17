/**
 * @author mangekyou
 */
function menu(str) {
				
				var xmlhttp;
				
				if (str == "") {
					document.getElementById("main-container").innerHTML = "";
				}
				
				if (window.XMLHttpRequest && !window.ActiveXObject) {// code for IE7+, Firefox, Chrome, Opera, Safari
					xmlhttp = new XMLHttpRequest();
				} else {// code for IE6, IE5
					try {
						xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
					} catch(e) {
						xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
					}
				}
				xmlhttp.onreadystatechange = function() {
					if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
						document.getElementById("main-container").innerHTML = xmlhttp.responseText;
					}
				};
				xmlhttp.open("GET", str + ".php", true);
				xmlhttp.send();
				
				activeNav(str);
			}
			
			function activeNav(str) {
				str=str.substr(4);
				$('li[id^="nav"].active').removeClass("active");		
				$('#nav-'+str).addClass("active");
				
					}

					window.addEventListener('load', activeNav('new_search'), false);
