<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_(.no-collapsable).on(click, function (e_b4218d</name>
   <tag></tag>
   <elementGuidId>cf3f8f2e-58ab-406a-b8da-385e3476ab68</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='datosRiesgoContent']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#datosRiesgoContent</value>
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
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>datosRiesgoContent</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>panel-body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
  

    


  $('.no-collapsable').on('click', function (e) {
    e.stopPropagation();
  });

  /*
   Detalle FRANQUICIA: este metodo se hace especifico para permitir distintos comportamientos por ramo
  */
  function actualizarDatosDetFranquicia() {
    hideMessage();

    let gridFranquicia = $(&quot;#grdRiesgo&quot;).data(&quot;kendoGrid&quot;);
    let jsonRiesgosFranquicia = gridFranquicia.dataSource.data().toJSON();
    UpdateCampoRiesgo(gridFranquicia, jsonRiesgosFranquicia, null);
  }



  
    
      
        
        Riesgos
      
      

  Prima automática
  SíNokendo.syncReady(function(){jQuery(&quot;#PrimaAutomatica_BoolValue&quot;).kendoSwitch({&quot;change&quot;:chkPrimaAutomatica_Click,&quot;checked&quot;:true,&quot;enabled&quot;:true,&quot;messages&quot;:{&quot;checked&quot;:&quot;Sí&quot;,&quot;unchecked&quot;:&quot;No&quot;}});});


      

  Tasas y franquicias automáticas
  SíNokendo.syncReady(function(){jQuery(&quot;#TasaYFranquiciaAutomatica_BoolValue&quot;).kendoSwitch({&quot;change&quot;:chkTasaYFranquiciaAutomatica_Click,&quot;checked&quot;:true,&quot;enabled&quot;:true,&quot;messages&quot;:{&quot;checked&quot;:&quot;Sí&quot;,&quot;unchecked&quot;:&quot;No&quot;}});});


    
  
  
    
    IdCódigoRiesgoSuma aseguradaTasa tarifarioTasa finalPrima  Total: 2.999.999,00   0,0047COBPUOBRA PÚBLICA
kendo.syncReady(function(){jQuery(&quot;#SumaAsegurada&quot;).kendoNumericTextBox({&quot;culture&quot;:&quot;en-US&quot;,&quot;decimals&quot;:2,&quot;round&quot;:false,&quot;spinners&quot;:false});});3,33003,33000,0046COBPROBRA PRIVADAkendo.syncReady(function(){jQuery(&quot;#grdRiesgo&quot;).kendoGrid({&quot;save&quot;:UpdateRiesgos,&quot;edit&quot;:grdRiesgo_Edit,&quot;dataBound&quot;:grdRiesgo_Databound,&quot;navigatable&quot;:true,&quot;noRecords&quot;:{&quot;template&quot;:&quot;\u003cspan style=\u0027width:98%;\u0027 class=\u0027no-records-text\u0027\u003eNo hay registros\u003c/span\u003e&quot;},&quot;sortable&quot;:true,&quot;columns&quot;:[{&quot;title&quot;:&quot;Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;RiesgoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Código&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;hidden&quot;:true,&quot;field&quot;:&quot;Codigo&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Riesgo&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;,&quot;class&quot;:&quot;non-editable-desc&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;footerTemplate&quot;:&quot;Total:&quot;,&quot;field&quot;:&quot;DescripcionRiesgo&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Suma asegurada&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;title&quot;:&quot;Base: #=HideNulls(SumaAseguradaBase)# Tope: #=HideNulls(SumaAseguradaTope)#&quot;,&quot;class&quot;:&quot;editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right; font-weight: bold;&quot;},&quot;footerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;class&quot;:&quot;non-editable&quot;},&quot;width&quot;:&quot;150px&quot;,&quot;footerTemplate&quot;:&quot;\u003cspan id=\u0027spanSumaAsegurada\u0027\u003e #=HideNulls(kendo.toString(sum, \u0027n2\u0027))#\u003c/span\u003e&quot;,&quot;field&quot;:&quot;SumaAsegurada&quot;,&quot;format&quot;:&quot;{0:n2}&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;aggregates&quot;:[&quot;sum&quot;],&quot;editor&quot;:&quot;\r\n\u003cinput data-val=\&quot;true\&quot; data-val-number=\&quot;The field must be a number.\&quot; id=\&quot;SumaAsegurada\&quot; max=\&quot;9999999999999\&quot; min=\&quot;0\&quot; name=\&quot;SumaAsegurada\&quot; style=\&quot;width:100%\&quot; type=\&quot;text\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#SumaAsegurada\&quot;).kendoNumericTextBox({\&quot;culture\&quot;:\&quot;en-US\&quot;,\&quot;decimals\&quot;:2,\&quot;round\&quot;:false,\&quot;spinners\&quot;:false});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;SumaAsegurada\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;},{&quot;title&quot;:&quot;Tasa tarifario&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;class&quot;:&quot;non-editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right; font-weight: bold;&quot;},&quot;width&quot;:&quot;150px&quot;,&quot;field&quot;:&quot;TasaTarifario&quot;,&quot;format&quot;:&quot;{0:n4}&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Tasa final&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;class&quot;:&quot;automatico-manual non-editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right; font-weight: bold;&quot;},&quot;width&quot;:&quot;150px&quot;,&quot;field&quot;:&quot;TasaFinal&quot;,&quot;format&quot;:&quot;{0:n4}&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\u003cinput data-val=\&quot;true\&quot; data-val-number=\&quot;The field must be a number.\&quot; id=\&quot;TasaFinal\&quot; max=\&quot;9999999999999\&quot; min=\&quot;0\&quot; name=\&quot;TasaFinal\&quot; style=\&quot;width:100%\&quot; type=\&quot;text\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#TasaFinal\&quot;).kendoNumericTextBox({\&quot;culture\&quot;:\&quot;en-US\&quot;,\&quot;decimals\&quot;:4,\&quot;round\&quot;:false,\&quot;spinners\&quot;:false});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;TasaFinal\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;},{&quot;title&quot;:&quot;Prima&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;class&quot;:&quot;prima-manual non-editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right; font-weight: bold;&quot;},&quot;footerAttributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;,&quot;class&quot;:&quot;non-editable&quot;},&quot;width&quot;:&quot;150px&quot;,&quot;footerTemplate&quot;:&quot;\u003cspan id=\u0027spanPrima\u0027\u003e #=HideNulls(kendo.toString(sum, \u0027n2\u0027))#\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PrimaProrrateada&quot;,&quot;format&quot;:&quot;{0:n2}&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;aggregates&quot;:[&quot;sum&quot;],&quot;editor&quot;:&quot;\r\n\u003cinput data-val=\&quot;true\&quot; data-val-number=\&quot;The field must be a number.\&quot; id=\&quot;PrimaProrrateada\&quot; max=\&quot;9999999999999\&quot; min=\&quot;-9999999999999\&quot; name=\&quot;PrimaProrrateada\&quot; style=\&quot;width:100%\&quot; type=\&quot;text\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#PrimaProrrateada\&quot;).kendoNumericTextBox({\&quot;culture\&quot;:\&quot;en-US\&quot;,\&quot;decimals\&quot;:2,\&quot;round\&quot;:false,\&quot;spinners\&quot;:false});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;PrimaProrrateada\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;}],&quot;scrollable&quot;:false,&quot;editable&quot;:{&quot;confirmation&quot;:&quot;Are you sure you want to delete this record?&quot;,&quot;confirmDelete&quot;:&quot;Delete&quot;,&quot;cancelDelete&quot;:&quot;Cancel&quot;,&quot;mode&quot;:&quot;incell&quot;,&quot;create&quot;:true,&quot;update&quot;:true,&quot;destroy&quot;:true,&quot;template&quot;:null},&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/CampoEmision/grdRiesgo_Read&quot;,&quot;data&quot;:filterRiesgo},&quot;prefix&quot;:&quot;&quot;},&quot;aggregate&quot;:[{&quot;field&quot;:&quot;SumaAsegurada&quot;,&quot;aggregate&quot;:&quot;sum&quot;},{&quot;field&quot;:&quot;SumaAseguradaCoaseguro&quot;,&quot;aggregate&quot;:&quot;sum&quot;},{&quot;field&quot;:&quot;PrimaProrrateada&quot;,&quot;aggregate&quot;:&quot;sum&quot;}],&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;MovimientoId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;Riesgo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;RiesgoId&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Codigo&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;DescripcionRiesgo&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;string&quot;},&quot;SumaAsegurada&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;SumaAseguradaBase&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;SumaAseguradaTope&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;SumaAseguradaDefecto&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;SumaAseguradaOrigen&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;SumaAseguradaCoaseguro&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TasaFinal&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;TasaTarifario&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;PrimaProrrateada&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;PrimaAnual&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;PrimaIntermedia&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Especifico&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;LlevaDetalleEspecificos&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;EsBase&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;Editable&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;RiesgoBaseId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Porcentaje&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;OrdenVisualizacion&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ExisteEnOrigen&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;FranquiciaId&quot;:{&quot;editable&quot;:false,&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;MedidaPrestacionId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;DescripcionMedidaPrestacion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EditableTyF&quot;:{&quot;type&quot;:&quot;boolean&quot;}}}}}});});
    Nota: las tasas se consideran en por mil(‰).
  



  
    
      
        
        Otros datos
      
    
  
  
    
  
Derecho de emisión      
      
    kendo.syncReady(function(){jQuery(&quot;#DerechoEmision_DecimalValue&quot;).kendoNumericTextBox({&quot;change&quot;:UpdateConceptoRiesgo,&quot;decimals&quot;:2,&quot;round&quot;:false,&quot;spinners&quot;:false});});  

    
  
Gastos de colegio      
      
    kendo.syncReady(function(){jQuery(&quot;#GastosColegio_DecimalValue&quot;).kendoNumericTextBox({&quot;change&quot;:UpdateConceptoRiesgo,&quot;decimals&quot;:2,&quot;round&quot;:false,&quot;spinners&quot;:false});});  

    
  
Gastos de escribanía      
      
    kendo.syncReady(function(){jQuery(&quot;#GastosEscribania_DecimalValue&quot;).kendoNumericTextBox({&quot;change&quot;:UpdateConceptoRiesgo,&quot;decimals&quot;:2,&quot;round&quot;:false,&quot;spinners&quot;:false});});  

  






    
        
            
                
                    Franquicia
                
                
                    
                        
                        
                        
                            
                                
                                    Tipo Franquicia
                                     
                                    Seleccionekendo.syncReady(function(){jQuery(&quot;#TipoFranquiciaId_grdRiesgo&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;valuePrimitive&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Franquicia/Franquicia/GetTiposFranquiciaAsync&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                                
                            
                            
                                
                                    Unidad Franquicia Valor
                                     
                                    Seleccionekendo.syncReady(function(){jQuery(&quot;#UnidadFranquiciaValorId_grdRiesgo&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;valuePrimitive&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Franquicia/Franquicia/GetUnidadesFranquiciaAsync&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                                
                            
                            
                                
                                    Base Franquicia Valor
                                     
                                    Seleccionekendo.syncReady(function(){jQuery(&quot;#BaseFranquiciaValorId_grdRiesgo&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;valuePrimitive&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Franquicia/Franquicia/GetBasesFranquiciaAsync&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                                
                            
                            
                                
                                    Valor Franquicia
                                     
                                    kendo.syncReady(function(){jQuery(&quot;#ValorFranquicia_grdRiesgo&quot;).kendoNumericTextBox({&quot;spinners&quot;:false});});
                                
                            
                            
                                
                                    Unidad Franquicia Tope
                                    Seleccionekendo.syncReady(function(){jQuery(&quot;#UnidadFranquiciaTopeId_grdRiesgo&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;valuePrimitive&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Franquicia/Franquicia/GetUnidadesFranquiciaAsync&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                                
                            
                            
                                
                                    Base Franquicia Tope
                                    Seleccionekendo.syncReady(function(){jQuery(&quot;#BaseFranquiciaTopeId_grdRiesgo&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;valuePrimitive&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Franquicia/Franquicia/GetBasesFranquiciaAsync&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                                
                            
                            
                                
                                    Tope Mínimo
                                    kendo.syncReady(function(){jQuery(&quot;#TopeMinimoFranquicia_grdRiesgo&quot;).kendoNumericTextBox({&quot;spinners&quot;:false});});
                                
                            
                            
                                
                                    Tope Máximo
                                    kendo.syncReady(function(){jQuery(&quot;#TopeMaximoFranquicia_grdRiesgo&quot;).kendoNumericTextBox({&quot;spinners&quot;:false});});
                                
                            
                        
                        
                            
                                Tipo franquicia
                                
                            
                            
                                Unidad Franquicia Valor
                                
                            
                            
                                Base Franquicia Valor
                                
                            
                            
                                Valor Franquicia
                                
                            
                            
                                Unidad Franquicia Tope
                                
                            
                            
                                Base Franquicia Tope
                                
                            
                            
                                Tope Mínimo
                                
                            
                            
                                Tope Máximo
                                
                            
                        
                    
                
                
                    Cerrar
                    Guardar
                
            
        
    






    var urlGetFranquicia = '/AdInsurance/Emision/Franquicia/Franquicia/GetFranquiciaById';
    var urlCreateOrUpdateFranquicia = '/AdInsurance/Emision/Franquicia/Franquicia/CreateOrUpdateFranquicia';
    var modoConsulta = 'False' == 'True' ? true : false;
    var alwaysCreate = 'True' == 'True' ? true : false;

    function templateFranquicia_grdRiesgo(data) {
        var ret = '&lt;button type=&quot;button&quot; class=&quot;btn btn-expresion&quot; onclick=&quot;showModalFranquicia_grdRiesgo(this)&quot; style=&quot;border-radius:50%; background-color:inherit&quot;>&lt;i class=&quot;fa fa-search&quot; style=&quot;color: #46b8da;&quot;>&lt;/i>&lt;/button>';

        return ret;
    }

    function showModalFranquicia_grdRiesgo(e) {
        $(&quot;#modalFranquicia_grdRiesgo&quot;).modal(&quot;show&quot;);

        modoConsulta = 'False' == 'True' ? true : false;

        var dataItem;
        var itemFranquiciaId;

        if ($(&quot;#grdRiesgo&quot;).data(&quot;kendoGrid&quot;)) {
            dataItem = $(&quot;#grdRiesgo&quot;).data(&quot;kendoGrid&quot;).dataItem($(e).closest(&quot;tr&quot;));
            $(&quot;#identificador_grdRiesgo&quot;).val(dataItem[&quot;RiesgoId&quot;]);
            var columna = &quot;EditableTyF-F&quot;;
            var modo = &quot;F&quot;;
            if (columna != &quot;&quot; &amp;&amp; !modoConsulta) {
                if (columna.split('-').length > 1) {
                    if(columna.split('-')[1])
                        modo = columna.split('-')[1].toUpperCase();
                    columna = columna.split('-')[0];

                    if (modo == &quot;T&quot;)
                        modoConsulta = dataItem[columna];
                    else
                        modoConsulta = !dataItem[columna];
                } else {
                    modoConsulta = !dataItem[columna];
                }
            }

            itemFranquiciaId = dataItem.FranquiciaId;
            $(&quot;#franquiciaId_grdRiesgo&quot;).val(dataItem.FranquiciaId);
        } else {
            itemFranquiciaId = $(&quot;#FranquiciaId&quot;).val();
            $(&quot;#franquiciaId_grdRiesgo&quot;).val(itemFranquiciaId);
        }


        if (modoConsulta) {
            $(&quot;#divModificacion_grdRiesgo&quot;).hide();
            $(&quot;#divModoConsulta_grdRiesgo&quot;).show();
            $(&quot;#btnAgregarFranquicia_grdRiesgo&quot;).hide();
        } else {
            $(&quot;#divModificacion_grdRiesgo&quot;).show();
            $(&quot;#divModoConsulta_grdRiesgo&quot;).hide();
            $(&quot;#btnAgregarFranquicia_grdRiesgo&quot;).show();
        }

        var url = urlGetFranquicia;
        var params = { id: itemFranquiciaId };

        $.ajax({
            url: url,
            datatype: &quot;json&quot;,
            data: params,
            success: function (response) {
                if (response) {
                    $(&quot;#TipoFranquiciaId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(response.TipoFranquiciaId);
                    $(&quot;#UnidadFranquiciaValorId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(response.UnidadFranquiciaValorId);
                    $(&quot;#BaseFranquiciaValorId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(response.BaseFranquiciaValorId);
                    $(&quot;#ValorFranquicia_grdRiesgo&quot;).data(&quot;kendoNumericTextBox&quot;).value(response.ValorFranquicia);
                    $(&quot;#UnidadFranquiciaTopeId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(response.UnidadFranquiciaTopeId);
                    $(&quot;#BaseFranquiciaTopeId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(response.BaseFranquiciaTopeId);
                    $(&quot;#TopeMinimoFranquicia_grdRiesgo&quot;).data(&quot;kendoNumericTextBox&quot;).value(response.TopeMinimoFranquicia);
                    $(&quot;#TopeMaximoFranquicia_grdRiesgo&quot;).data(&quot;kendoNumericTextBox&quot;).value(response.TopeMaximoFranquicia);

                    if (response.TipoFranquicia) $(&quot;#TipoFranquiciaLabel_grdRiesgo&quot;).text(response.TipoFranquicia.Descripcion + &quot; [&quot; + response.TipoFranquiciaId + &quot;]&quot;);
                    if (response.UnidadFranquiciaValor) $(&quot;#UnidadFranquiciaValorLabel_grdRiesgo&quot;).text(response.UnidadFranquiciaValor.Descripcion + &quot; [&quot; + response.UnidadFranquiciaValorId + &quot;]&quot;);
                    if (response.BaseFranquiciaValor) $(&quot;#BaseFranquiciaValorLabel_grdRiesgo&quot;).text(response.BaseFranquiciaValor.Descripcion + &quot; [&quot; + response.BaseFranquiciaValorId + &quot;]&quot;);
                    $(&quot;#ValorFranquiciaLabel_grdRiesgo&quot;).text(response.ValorFranquicia);
                    if (response.UnidadFranquiciaTope) $(&quot;#UnidadFranquiciaTopeLabel_grdRiesgo&quot;).text(response.UnidadFranquiciaTope.Descripcion + &quot; [&quot; + response.UnidadFranquiciaTopeId + &quot;]&quot;);
                    if (response.BaseFranquiciaTope) $(&quot;#BaseFranquiciaTopeLabel_grdRiesgo&quot;).text(response.BaseFranquiciaTope.Descripcion + &quot; [&quot; + response.BaseFranquiciaTopeId + &quot;]&quot;);
                    $(&quot;#TopeMinimoFranquiciaLabel_grdRiesgo&quot;).text(response.TopeMinimoFranquicia);
                    $(&quot;#TopeMaximoFranquiciaLabel_grdRiesgo&quot;).text(response.TopeMaximoFranquicia);
                } else {
                    clearDetFranquicia_grdRiesgo();
                }
            }
        });
    }

    function clearDetFranquicia_grdRiesgo() {
        $(&quot;#TipoFranquiciaId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(&quot;&quot;);
        $(&quot;#UnidadFranquiciaValorId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(&quot;&quot;);
        $(&quot;#BaseFranquiciaValorId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(&quot;&quot;);
        $(&quot;#ValorFranquicia_grdRiesgo&quot;).data(&quot;kendoNumericTextBox&quot;).value(&quot;&quot;);
        $(&quot;#UnidadFranquiciaTopeId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(&quot;&quot;);
        $(&quot;#BaseFranquiciaTopeId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(&quot;&quot;);
        $(&quot;#TopeMinimoFranquicia_grdRiesgo&quot;).data(&quot;kendoNumericTextBox&quot;).value(&quot;&quot;);
        $(&quot;#TopeMaximoFranquicia_grdRiesgo&quot;).data(&quot;kendoNumericTextBox&quot;).value(&quot;&quot;);

        $(&quot;#TipoFranquiciaLabel_grdRiesgo&quot;).text(&quot;&quot;);
        $(&quot;#UnidadFranquiciaValorLabel_grdRiesgo&quot;).text(&quot;&quot;);
        $(&quot;#BaseFranquiciaValorLabel_grdRiesgo&quot;).text(&quot;&quot;);
        $(&quot;#ValorFranquiciaLabel_grdRiesgo&quot;).text(&quot;&quot;);
        $(&quot;#UnidadFranquiciaTopeLabel_grdRiesgo&quot;).text(&quot;&quot;);
        $(&quot;#BaseFranquiciaTopeLabel_grdRiesgo&quot;).text(&quot;&quot;);
        $(&quot;#TopeMinimoFranquiciaLabel_grdRiesgo&quot;).text(&quot;&quot;);
        $(&quot;#TopeMaximoFranquiciaLabel_grdRiesgo&quot;).text(&quot;&quot;);
    }

    function agregarDetFranquicia_grdRiesgo() {
        var soloAlta = 'True' == 'True' ? true : false;

        var popUpNotificacion = $(&quot;#popUpNotification_grdRiesgo&quot;).kendoNotification({ appendTo: &quot;#franquiciaBody&quot; }).data(&quot;kendoNotification&quot;);

        var franquicia = {
            Id: $(&quot;#franquiciaId_grdRiesgo&quot;).val(),
            TipoFranquiciaId: $(&quot;#TipoFranquiciaId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(),
            UnidadFranquiciaValorId: $(&quot;#UnidadFranquiciaValorId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(),
            BaseFranquiciaValorId: $(&quot;#BaseFranquiciaValorId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(),
            ValorFranquicia: $(&quot;#ValorFranquicia_grdRiesgo&quot;).data(&quot;kendoNumericTextBox&quot;).value(),
            UnidadFranquiciaTopeId: $(&quot;#UnidadFranquiciaTopeId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(),
            BaseFranquiciaTopeId: $(&quot;#BaseFranquiciaTopeId_grdRiesgo&quot;).data(&quot;kendoDropDownList&quot;).value(),
            TopeMinimoFranquicia: $(&quot;#TopeMinimoFranquicia_grdRiesgo&quot;).data(&quot;kendoNumericTextBox&quot;).value(),
            TopeMaximoFranquicia: $(&quot;#TopeMaximoFranquicia_grdRiesgo&quot;).data(&quot;kendoNumericTextBox&quot;).value()
        };

        if (franquicia.Id == &quot;&quot; || franquicia.Id == null)
            franquicia.Id = 0;

        var errores = &quot;&quot;;

        if (franquicia.TipoFranquiciaId == &quot;&quot; || franquicia.TipoFranquiciaId == null)
            errores = &quot;Debe seleccionar un tipo franquicia.&lt;br/>&quot;;

        if (franquicia.UnidadFranquiciaValorId == &quot;&quot; || franquicia.UnidadFranquiciaValorId == null)
            errores += &quot;Debe seleccionar una unidad de franquicia valor.&lt;br/>&quot;;

        if (franquicia.BaseFranquiciaValorId == &quot;&quot; || franquicia.BaseFranquiciaValorId == null)
            errores += &quot;Debe seleccionar una base de franquicia valor.&lt;br/>&quot;;

        if (franquicia.ValorFranquicia == &quot;&quot; || franquicia.ValorFranquicia == null)
            errores += &quot;Debe ingresar un valor.&lt;br/>&quot;;

        if ((franquicia.TopeMinimoFranquicia != &quot;&quot; &amp;&amp; franquicia.TopeMinimoFranquicia != null)
            &amp;&amp; (franquicia.TopeMaximoFranquicia != &quot;&quot; &amp;&amp; franquicia.TopeMaximoFranquicia != null)
            &amp;&amp; franquicia.TopeMinimoFranquicia > franquicia.TopeMaximoFranquicia)
            errores += &quot;El tope mínimo debe ser menor o igual al tope máximo&quot;;

        if (errores != &quot;&quot;) {
            popUpNotificacion.show(errores, &quot;error&quot;);
            return;
        }

        var url = urlCreateOrUpdateFranquicia;
        var params = { franquiciaJson: JSON.stringify(franquicia), alwaysCreate: soloAlta };

        $.ajax({
            url: url,
            datatype: &quot;json&quot;,
            data: params,
            success: function (response) {
                let identificador = $(&quot;#identificador_grdRiesgo&quot;).val();

                if ($(&quot;#grdRiesgo&quot;).data(&quot;kendoGrid&quot;)) {
                    let data = $(&quot;#grdRiesgo&quot;).data(&quot;kendoGrid&quot;).dataSource.data();
                    data.find(x => x[&quot;RiesgoId&quot;] == identificador).FranquiciaId = response;

                    actualizarDatosDetFranquicia(data, identificador);
                } else {
                  $(&quot;#FranquiciaId_grdRiesgo&quot;).val(response);
                  actualizarDatosDetFranquicia(response);
                }

                $(&quot;#modalFranquicia_grdRiesgo&quot;).modal(&quot;hide&quot;);
            },
            error: function (response) {
                popUpNotificacion.show(response, &quot;error&quot;);
            }
        });
    }

    function eliminarDetFranquicia_grdRiesgo() {
        let identificador = $(&quot;#identificador_grdRiesgo&quot;).val();

        if ($(&quot;#grdRiesgo&quot;).data(&quot;kendoGrid&quot;)) {
            let data = $(&quot;#grdRiesgo&quot;).data(&quot;kendoGrid&quot;).dataSource.data();
            data.find(x => x[&quot;RiesgoId&quot;] == identificador).FranquiciaId = null;

            actualizarDatosDetFranquicia(data, identificador);
        } else {
            $(&quot;#FranquiciaId_grdRiesgo&quot;).val(null);
            actualizarDatosDetFranquicia(null);
        }

        $(&quot;#modalFranquicia_grdRiesgo&quot;).modal(&quot;hide&quot;);
    }

    
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;datosRiesgoContent&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='datosRiesgoContent']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='vistaContent']/div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Estado: Incompleta'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div[2]/div/div[2]</value>
   </webElementXpaths>
</WebElementEntity>
