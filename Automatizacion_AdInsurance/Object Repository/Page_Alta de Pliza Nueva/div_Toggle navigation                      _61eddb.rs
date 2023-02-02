<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Toggle navigation                      _61eddb</name>
   <tag></tag>
   <elementGuidId>1e601156-3db9-4e31-ab42-74d409166ffa</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>div.content-wrapper</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[4]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>content-wrapper</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
        
          
            
              
                
                  
                  
                    
                      Toggle navigation
                      
                      
                      
                    
                    
                      
                        
                         Alta  de Póliza Nueva - Caución - 42815 
                        
                      
                      
                    
                  

                  
                  
                    
                      
                    
                  
                
              

            

            
              
            
            
              ×
              
              
            

            

            
              
                
                Filtros
                
                   Limpiar
                
              
              
                
              
            

            

            
              
                




  
  
  
  
  
  

  
  
  
  



  

    
      
        
      

      
        La emisión del movimiento 669951 se realizó correctamente
        Estado de movimiento: Presupuestada
        Número de cotización: 42815 
        Estado de cotización: Emitida 
          Número de póliza: 000000089013 
                  Número de endoso: 00000 
                              

      
          
            Iniciar otra Alta de Póliza
          
                          
            Imprimir
          
        
          Continuar »
                
      

    
  








  function mostrarModalImpresion(cotizacionImpresionId, extraParamsQS) {
    $('#hdnCotizacionImpresionId').val(cotizacionImpresionId);
    $('#hdnExtraParamsQS').val(extraParamsQS);
    $(&quot;#cboDestinatarios&quot;).getKendoDropDownList().value(null);
    $('#divFormularios')[0].innerHTML = '';
    $(&quot;#spanFormularios&quot;).css(&quot;visibility&quot;, &quot;hidden&quot;);
    SetOpcionImprimirDisable(false);

    $(&quot;#cboDestinatarios&quot;).getKendoDropDownList().dataSource.read();

    $('#modalImpresion').modal('toggle');
  }

  function imprimirCotizacion() {
    $('#modalImpresion').modal('toggle');

    let cotizacionImpresionId = $('#hdnCotizacionImpresionId').val();
    let formsIds = [];

    $.each($('#divFormularios').find('.checkFormulario'), function (index, obj) {
      if(obj.checked)
        formsIds.push(obj.value);
    });

    let urlImprimir = &quot;/adinsurance/Emision/Gestion/Movimiento/ImprimirCotizacion&quot; + &quot;?cotizacionId=&quot; + cotizacionImpresionId + (formsIds.length > 0 ? &quot;&amp;formsIds=&quot; + formsIds.join(',') : &quot;&quot;) + &quot;&amp;&quot; + $('#hdnExtraParamsQS').val();
    window.open(urlImprimir, &quot;_blank&quot;);
  }

  function cargarFormulariosImpresion(e) {
    let formulariosHtml = '';
    $(&quot;#spanFormularios&quot;).css(&quot;visibility&quot;, &quot;hidden&quot;);
    SetOpcionImprimirDisable(false);

    if (e.sender.dataItem() &amp;&amp; e.sender.dataItem().FormulariosAvailables) {
      let formularios = e.sender.dataItem().FormulariosAvailables;
      if (formularios.length > 1) {
        formulariosHtml += '&lt;span>&lt;input type=&quot;checkbox&quot; id=&quot;chkTodosFormularios&quot; checked=&quot;true&quot; onclick=&quot;chkTodosFormularios_Click(this);&quot;/>&amp;nbspTodos&lt;/span>&lt;br>';
      }
      if (formularios.length > 0) {
        $(&quot;#spanFormularios&quot;).css(&quot;visibility&quot;, &quot;&quot;);
      }

      SetOpcionImprimirDisable(formularios.length == 0);

      $.each(formularios, function (index, obj) {
        formulariosHtml += '&lt;span>&lt;input type=&quot;checkbox&quot; class=&quot;checkFormulario&quot; checked=&quot;true&quot; onclick=&quot;chkFormulario_Click(this);&quot; value=' + obj.ID + ' />&amp;nbsp;' + obj.Descripcion + '&lt;/span>&lt;br>';

        if (index == formularios.length - 1)
          formulariosHtml += '&lt;br>';
      });
    }

    $('#divFormularios')[0].innerHTML = formulariosHtml;
  }

  function SetOpcionImprimirDisable(disable) {
    $('#btnImprimir').attr(&quot;disabled&quot;, disable);
  }

  function chkFormulario_Click(control) {
    let dataItem = $(&quot;#cboDestinatarios&quot;).getKendoDropDownList().dataItem();
    let formSeleccionado = false;
    let todosSeleccionados = true;

    $.each($('#divFormularios').find('.checkFormulario'), function (index, obj) {
      if (obj.checked)
        formSeleccionado = true;
      else
        todosSeleccionados = false;
    });

    if($(&quot;#chkTodosFormularios&quot;).length > 0)
      $(&quot;#chkTodosFormularios&quot;)[0].checked = todosSeleccionados;

    SetOpcionImprimirDisable(!formSeleccionado);
  }

  function chkTodosFormularios_Click(control) {
    $.each($('#divFormularios').find('.checkFormulario'), function (index, obj) {
      obj.checked = control.checked;
    });
    SetOpcionImprimirDisable(!control.checked);
  }

  function filterCotizacionSeleccion() {
    return {
      cotizacionId: $(&quot;#hdnCotizacionImpresionId&quot;).val()
    };
  }










  

    
      
        ×
        Selección de destinatario y formularios
      

      

        
          ×
          
        

        
          
          
            
              Destinatario:
            
            
              Todoskendo.syncReady(function(){jQuery(&quot;#cboDestinatarios&quot;).kendoDropDownList({&quot;change&quot;:cargarFormulariosImpresion,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;ID&quot;,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/adinsurance/Emision/Gestion/Movimiento/GetDestinatariosImpresion&quot;,&quot;data&quot;:filterCotizacionSeleccion},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
            
          
          
          
            
              Formularios:
            
            
            
          
          
          
            Cancelar
            Imprimir
          
          
        
        
        
      

    
  


  function filterByMovimiento() {
    return {
      movimientoId: $(&quot;#Id&quot;).val()
    };
  }

  function Continuar() {
    let target = '/adinsurance/Emision/Gestion/Movimiento/ConsultaMovimientos';
    let args = [];

    if ($('#ConsultaMovimientoNombre').val()) {
      args.push('nombre=' + $('#ConsultaMovimientoNombre').val());
    }
    if ($('#ConsultaMovimientoFilters').val()) {
      args.push('filterValues=' + $('#ConsultaMovimientoFilters').val());
    }
    if ($('#ConsultaMovimientoColumns').val()) {
      args.push('columnValues=' + $('#ConsultaMovimientoColumns').val());
    }

    target = target + (args.length > 0 ? '?' + args.join('&amp;') : '');

    window.location.href = target;
  }

  function NuevoMovimiento() {
      var target = '/adinsurance/Emision/Gestion/Movimiento/NuevoMovimiento';

      let args = [];

      if ($('#RamoId').val()) {
        args.push('RamoId=' + $('#RamoId').val());
      }
      if ($('#SubRamoId').val()) {
        args.push('SubramoId=' + $('#SubRamoId').val());
      }
      if ($('#ConsultaMovimientoNombre').val()) {
        args.push('consultaNombre=' + $('#ConsultaMovimientoNombre').val());
      }
      if ($('#ConsultaMovimientoFilters').val()) {
        args.push('filterValues=' + $('#ConsultaMovimientoFilters').val());
      }
      if ($('#ConsultaMovimientoColumns').val()) {
        args.push('columnValues=' + $('#ConsultaMovimientoColumns').val());
      }

      target = target + (args.length > 0 ? '?' + args.join('&amp;') : '');

      if (shiftIsPressed)
       target = target + &quot;&amp;modoDebug=1&quot;;

      customOpenWindow(target);
  }

  function Modificar() {
      let cotizacionId = 42815;

      var target = &quot;/adinsurance/Emision/Gestion/Movimiento/Modificar&quot; + &quot;?cotizacionId=&quot; + cotizacionId;

      let args = [];

      if ($('#ConsultaMovimientoNombre').val()) {
        args.push('consultaNombre=' + $('#ConsultaMovimientoNombre').val());
      }
      if ($('#ConsultaMovimientoFilters').val()) {
        args.push('filterValues=' + $('#ConsultaMovimientoFilters').val());
      }
      if ($('#ConsultaMovimientoColumns').val()) {
        args.push('columnValues=' + $('#ConsultaMovimientoColumns').val());
      }

      target = target + (args.length > 0 ? '&amp;' + args.join('&amp;') : '');

      if (shiftIsPressed)
       target = target + &quot;&amp;modoDebug=1&quot;;

      customOpenWindow(target);
  }

  function Imprimir() {
      let cotizacionId = 42815;
      mostrarModalImpresion(cotizacionId);
  }

  $(document).ready(function (event) {
    //Animacion icono
    setTimeout(
      function () {
        $('#divIcon').toggleClass('drop');
      }, 700);

    //Anchos botones accion (con máximo)
    let botonesCount = $(&quot;.btnAccion&quot;).length;
    let anchoCol = 12;

    if (botonesCount > 0)
      anchoCol = Math.floor(anchoCol / botonesCount);
    if (anchoCol > 4)
      anchoCol = 4;

    $(&quot;.btnAccion&quot;).addClass(&quot;col-md-&quot; + anchoCol);

  });




  divIcon {
    background: #0ba;
  }

  .drop {
    animation: drop 1.2s forwards;
  }

@keyframes drop {
  to {
    transform-origin: center;
    opacity: 1;
  }
  40%,45% {
    transform:
      translate3d(0, 20px, 0)
      rotate3d(0, 0, 1, -10deg);
    opacity: 1;
  }
  20% {
    transform:
      translate3d(0, -20px, 0)
      rotate3d(0, 0, 1, 10deg);
    opacity: 1;
  }
  0% {
    opacity: 0;
    transform:
      translate3d(0, 0px, 0)
      rotate3d(0, 0, 1, 10deg);
  }
}

                
              
            

            
          
        
        
      </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;k-webkit k-webkit85&quot;]/body[@class=&quot;skin-green custom-skin sidebar-collapse sidebar-mini&quot;]/form[1]/div[@class=&quot;wrapper&quot;]/div[@class=&quot;content-wrapper&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[4]</value>
   </webElementXpaths>
</WebElementEntity>
