
//requerido para menu lateral		
		 dojo.require("dijit.layout.TabContainer");
		 dojo.require("dijit.layout.ContentPane");

//Requerido para Accordion
		 dojo.require('dijit.layout.AccordionContainer');
		 dojo.require('dijit.layout.ContentPane');

		    
		    
// Require the Tooltip class
		dojo.require("dijit.Tooltip");
		// When the DOM and reources are ready....
		dojo.ready(function(){
			//definimos la posicion de los tooltips
			dijit.Tooltip.defaultPosition = ["below","above"];
			
	//Agregamos traduccion en tooltip para el header
			new dijit.Tooltip({
   			    connectId: ["header-title"],
   			    label: "Biogeographic Atlas of the Terrestrial Mammals of North America - Home"
   			});

			new dijit.Tooltip({
   			    connectId: ["escudoUNAM"],
   			    label: "UNAM - Homepage"
   			});
	// Agregamos tooltip para el menu principal
			new dijit.Tooltip({
   			    connectId: ["marcoTeoricoTip"],
   			    label: "Theoretical Framework"
   			});
			new dijit.Tooltip({
   			    connectId: ["mamnaTip"],
   			    label: "MamNA Database"
   			});
			new dijit.Tooltip({
   			    connectId: ["busquedaTip"],
   			    label: "Search"
   			});
			new dijit.Tooltip({
   			    connectId: ["creditosTip"],
   			    label: "Credits"
   			});
			new dijit.Tooltip({
   			    connectId: ["accesoTip"],
   			    label: "Login"
   			});
	// agregamos tooltip para login
			new dijit.Tooltip({
   			    connectId: ["usuarioTip"],
   			    label: "User"
   			});
			new dijit.Tooltip({
   			    connectId: ["contrasenaTip"],
   			    label: "Password"
   			});
			new dijit.Tooltip({
   			    connectId: ["accesoTip"],
   			    label: "Access"
   			});
	// agregamos tooltip a personalizar
			var myTip = new dijit.Tooltip({
				connectId: ["hoverLink"],
				label: "Don't I look funky?",
				"class": "customTip"
			});
		});
