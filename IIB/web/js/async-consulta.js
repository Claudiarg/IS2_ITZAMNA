//******realiza consulta en DB mediante el campo Especie********//	
function consulta(type,str){
    
    if (str == ""){
        document.getElementById("main-content").innerHTML="";
    }
    
    var xmlhttp=returnXmlhttp();
    
    xmlhttp.onreadystatechange=function(){
        if (xmlhttp.readyState==4 && xmlhttp.status==200){
            document.getElementById("main-content").innerHTML=xmlhttp.responseText;
        }
    };
    // xmlhttp.open("GET","include/new_consulta.php?p="+type+"&q="+str+"&r=@&s=",true);
    // xmlhttp.send();

    var datos="p="+type+"&q="+str+"&r=@&s=";
    
    xmlhttp.open("POST","consulta.php",true);
    xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    /* xmlhttp.setRequestHeader("Content-length", datos.length);
        xmlhttp.setRequestHeader("Connection", "close");*/
    xmlhttp.send(datos);
    
};

function consultaExt(type,str,antcamp,antstr){

    if (str == ""){
        document.getElementById("main-content").innerHTML="";
    }
    
    var xmlhttp=returnXmlhttp();
    
    xmlhttp.onreadystatechange=function(){
        if (xmlhttp.readyState==4 && xmlhttp.status==200){
            document.getElementById("main-content").innerHTML=xmlhttp.responseText;
        }
    };
    
   // xmlhttp.open("GET","include/new_consulta.php?p="+type+"&q="+str+"&r="+antcamp+"&s="+antstr,true);
   //xmlhttp.send();
    
    var datos="p="+type+"&q="+str+"&r="+antcamp+"&s="+antstr;
    
    xmlhttp.open("POST","consulta.php",true);
    xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        /* xmlhttp.setRequestHeader("Content-length", datos.length);
        xmlhttp.setRequestHeader("Connection", "close");*/
    xmlhttp.send(datos);
    
};

function returnXmlhttp(){
    
    var xmlhttp;
    
    if (window.XMLHttpRequest && !window.ActiveXObject){// code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp=new XMLHttpRequest();
    }
    else{// code for IE6, IE5
        try{
            xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
        }
        catch(e){
            xmlhttp=new ActiveXObject("Msxml2.XMLHTTP");
        }
    }
   return xmlhttp;
};