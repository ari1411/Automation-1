<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_var cntrlIsPressed  false  (this).keyd_b6b572</name>
   <tag></tag>
   <elementGuidId>bf8eb596-d981-4198-8875-f530f8ed04ca</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body.skin-green.custom-skin.sidebar-collapse.sidebar-mini</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>skin-green custom-skin sidebar-collapse sidebar-mini</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
  
    
    
    
      
      

      















  var cntrlIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
  });

  $(this).mousedown(function (evt) {

    if (!evt) evt = event;

    if (evt.which == 2) {
      cntrlIsPressed = true;
    }
  });

  function customOpenMenu(url) {
    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
  }


  var urlUpdatePerfilUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/UpdatePerfilUsuario';
  var urlGetDatosPerfilUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetDatosPerfilUsuario';
  var urlGetDatosSesionUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetDatosSesionUsuario';
  var urlGetEmpresaDescripcionUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetEmpresaDescripcionUsuario';
  var urlGetEmpresaUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetEmpresaUsuario';
  var urlGetUnidadOperativaUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetUnidadOperativaUsuario';
  var urlGetSucursalUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetSucursalUsuario';
  var urlGetCentroAtencionUsuario = '/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetCentroAtencionUsuario';


  function cbonavheader_close(e) {
    $(&quot;#liPerfilUsuario&quot;).data(&quot;canClose&quot;, false);
  }

  $(document).ready(function ()
  {
    navheader_GetEmpresaDescripcionUsuario();
    navheader_SetDatosSesion();

    //$(&quot;.cboPerfilUsuario&quot;).on(&quot;change&quot;, function (e) {
    //  $(&quot;#liPerfilUsuario&quot;).data(&quot;canClose&quot;, false);
    //});

    $(&quot;#liPerfilUsuario&quot;).on({
      &quot;shown.bs.dropdown&quot;: function () {
        $(&quot;#menuPerfilUsuario&quot;).addClass('stay-open');
      },
      &quot;click&quot;: function () { return !$(&quot;#menuPerfilUsuario&quot;).hasClass('stay-open'); },
      &quot;hide.bs.dropdown&quot;: function (e) {
        if ($('#liPerfilUsuario').data('canClose') == false) {
          e.preventDefault();
          $('#liPerfilUsuario').data('canClose', true);
        } else {
          //Al cerrar refresco el valor de Empresa para reiniciar los valores de combos
          navheader_GetDatoUsuario(urlGetEmpresaUsuario, $(&quot;#cboEmpresa&quot;).data(&quot;kendoDropDownList&quot;));

          $(&quot;#menuPerfilUsuario&quot;).removeClass('stay-open');
        }
      }
      });
  });


  const
    navheader_cboEmpresa_databound = (e) => {
      navheader_GetDatoUsuario(urlGetEmpresaUsuario, e.sender);
    },
    navheader_cboEmpresa_change = (e) => {
      navheader_refreshChildCbo(e.sender, $(&quot;#cboUnidadOperativa&quot;).data(&quot;kendoDropDownList&quot;));
      navheader_refreshChildCbo(null, $(&quot;#cboSucursal&quot;).data(&quot;kendoDropDownList&quot;));
      navheader_refreshChildCbo(null, $(&quot;#cboCentroAtencion&quot;).data(&quot;kendoDropDownList&quot;));
    },

    navheader_cboUnidadOperativa_databound = (e) => {
      navheader_GetDatoUsuario(urlGetUnidadOperativaUsuario, e.sender);
    },
    navheader_cboUnidadOperativa_change = (e) => {
      navheader_refreshChildCbo(e.sender, $(&quot;#cboSucursal&quot;).data(&quot;kendoDropDownList&quot;));
      navheader_refreshChildCbo(null, $(&quot;#cboCentroAtencion&quot;).data(&quot;kendoDropDownList&quot;));
    },
    navheader_filterUnidadOperativa = () => {
      let empresaId = $(&quot;#cboEmpresa&quot;).data(&quot;kendoDropDownList&quot;).value();
      return { empresaId: empresaId };
    },

    navheader_cboSucursal_databound = (e) => {
      navheader_GetDatoUsuario(urlGetSucursalUsuario, e.sender);
    },
    navheader_cboSucursal_change = (e) => {
      navheader_refreshChildCbo(e.sender, $(&quot;#cboCentroAtencion&quot;).data(&quot;kendoDropDownList&quot;));
    },
    navheader_filterSucursal = () => {
      let empresaId = $(&quot;#cboEmpresa&quot;).data(&quot;kendoDropDownList&quot;).value();
      let unidadOperativaId = $(&quot;#cboUnidadOperativa&quot;).data(&quot;kendoDropDownList&quot;).value();
      return { empresaId: empresaId, unidadOperativaId: unidadOperativaId };
    },

    navheader_cboCentroAtencion_databound = (e) => {
      navheader_GetDatoUsuario(urlGetCentroAtencionUsuario, e.sender);
    },
    navheader_filterCentroAtencion = () => {
      let empresaId = $(&quot;#cboEmpresa&quot;).data(&quot;kendoDropDownList&quot;).value();
      let sucursalId = $(&quot;#cboSucursal&quot;).data(&quot;kendoDropDownList&quot;).value();
      return { empresaId: empresaId, sucursalId: sucursalId };
    },

    navheader_refreshChildCbo = (cboParent, cboChild) => {
      if (cboParent &amp;&amp; cboParent.value()) {        
        $(cboChild).attr('setDefaultValue', true);
        cboChild.dataSource.read();
      }
      else {
        cboChild.value(null);
        cboChild.dataSource.data([]);
      }
    },
    navheader_CerrarPerfilUsuario = () => {
      $(&quot;#menuPerfilUsuario&quot;).removeClass('stay-open');
    },
    navheader_GetEmpresaDescripcionUsuario = () => {
      $.ajax({
        url: urlGetEmpresaDescripcionUsuario,
        datatype: &quot;json&quot;,
        success: function (response) {
          $(&quot;#spanEmpresaDescripcion&quot;).text(response);
        },
        error: function (response) {
          adin_modal_simple(&quot;Error al obtener datos de usuario:&quot; + response.responseJSON.toString());
        }
      });
    },
    navheader_GetDatoUsuario = (url, cbo) => {
      let setDefaultValue = $(cbo).attr('setDefaultValue');
      if (setDefaultValue &amp;&amp; cbo.items().length == 1) {
        cbo.select(1);
        cbo.trigger('change');
      }
      else {
        $.ajax({
          url: url,
          datatype: &quot;json&quot;,
          success: function (response) {
            if (response) {
              cbo.value(response);
              cbo.trigger('change');
            }
            else {
              cbo.value(null);
            }
          },
          error: function (response) {
            adin_modal_simple(&quot;Error al obtener datos de usuario:&quot; + response.responseJSON.toString());
          }
        });
      }

      $(cbo).attr('setDefaultValue', false);
    },
    navheader_SetDatosUsuario = () => {
      $.ajax({
        url: urlGetDatosPerfilUsuario,
        datatype: &quot;json&quot;,
        success: function (response) {
          $(&quot;#cboEmpresa&quot;).data(&quot;kendoDropDownList&quot;).value(response.EmpresaId);
          $(&quot;#cboUnidadOperativa&quot;).data(&quot;kendoDropDownList&quot;).value(response.UnidadOperativaId);
          $(&quot;#cboSucursal&quot;).data(&quot;kendoDropDownList&quot;).value(response.SucursalId);
          $(&quot;#cboCentroAtencion&quot;).data(&quot;kendoDropDownList&quot;).value(response.CentroAtencionId);
        },
        error: function (response) {
          adin_modal_simple(&quot;Error al obtener datos de usuario:&quot; + response.responseJSON.toString());
        }
      });
    },
    navheader_SetDatosSesion = () => {
      var params = {
        sistemaId: 2,
      };

      $.ajax({
        url: urlGetDatosSesionUsuario,
        datatype: &quot;json&quot;,
        data: params,
        success: function (response) {
          $(&quot;#spanSesionId&quot;).text('Sesi??n: ' + response.SesionId);
          $(&quot;#spanFechaIngreso&quot;).text('??ltimo ingreso: ' + kendo.toString(kendo.parseDate(response.FechaIngreso), 'dd/MM/yyyy HH:mm:ss'));
          
          if (response.FechaIngresoAnterior)
            $(&quot;#spanFechaIngresoAnterior&quot;).text('Ingreso anterior: ' + kendo.toString(kendo.parseDate(response.FechaIngresoAnterior), 'dd/MM/yyyy HH:mm:ss'));
          else
            $(&quot;#spanFechaIngresoAnterior&quot;).text('Ingreso anterior: -');
        },
        error: function (response) {
          adin_modal_simple(&quot;Error al obtener datos de sesi??n:&quot; + response.responseJSON.toString());
        }
      });
    },
    navheader_UpdatePerfilUsuario = () => {
      let empresaId = $(&quot;#cboEmpresa&quot;).data(&quot;kendoDropDownList&quot;).value(),
        unidadOperativaId = $(&quot;#cboUnidadOperativa&quot;).data(&quot;kendoDropDownList&quot;).value(),
        sucursalId = $(&quot;#cboSucursal&quot;).data(&quot;kendoDropDownList&quot;).value(),
        centroAtencionId = $(&quot;#cboCentroAtencion&quot;).data(&quot;kendoDropDownList&quot;).value();

      if (!empresaId)
        adin_modal_simple('No se puede actualizar el perfil de usuario: Debe seleccionar una empresa.');
      else if (!unidadOperativaId)
        adin_modal_simple('No se puede actualizar el perfil de usuario: Debe seleccionar una unidad operativa.');
      else if (!sucursalId)
        adin_modal_simple('No se puede actualizar el perfil de usuario: Debe seleccionar una sucursal.');
      else {
        adin_modal_overlay(&quot;Actualizando perfil. Por favor espere...&quot;, true);

        var params = {
          empresaId: empresaId,
          unidadOperativaId: unidadOperativaId,
          sucursalId: sucursalId,
          centroAtencionId: centroAtencionId,
        };

        $.ajax({
          url: urlUpdatePerfilUsuario,
          datatype: &quot;json&quot;,
          data: params,
          success: function (response) {
            window.location.reload();
          },
          error: function (response) {
            adin_modal_overlay(null, false);
            adin_modal_simple(&quot;Error al actualizar perfil de usuario:&quot; + response.responseJSON.toString());
          }
        });
      };
    }



  
  
    
    
      
      AdInsurance
    
    
    
      
      AdInsurance
    
  
  
  
    
    
      
    
    
      
        
        
          
            1.16.0.3123
          
          
            
            
              
                Aplicaci??n:
              
              
                01.16.000
              
              
                Modelo de datos:
              
              
                01.16.000
              
            
          
        
        
        
          
            
            Emisi??n
          
          
                
                  Cobranzas
                
                
                  General
                
                
                  Impresi??n
                
                
                  Inspecciones
                
                
                  Portal productores
                
                
                  Reaseguros
                
                
                  Reportes
                
                
                  Siniestros
                
          
        

        
          
            
              
              Meridional Seguros
            
            
              
              
                Empresa
                Meridional Seguros [1]kendo.syncReady(function(){jQuery(&quot;#cboEmpresa&quot;).kendoDropDownList({&quot;change&quot;:navheader_cboEmpresa_change,&quot;dataBound&quot;:navheader_cboEmpresa_databound,&quot;close&quot;:cbonavheader_close,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetEmpresas&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
              
              
              
                Unidad operativa
                La Meridional [1]kendo.syncReady(function(){jQuery(&quot;#cboUnidadOperativa&quot;).kendoDropDownList({&quot;change&quot;:navheader_cboUnidadOperativa_change,&quot;dataBound&quot;:navheader_cboUnidadOperativa_databound,&quot;close&quot;:cbonavheader_close,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetUnidadesOperativas&quot;,&quot;data&quot;:navheader_filterUnidadOperativa},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
              
              
              
                Sucursal
                Casa Central [1]kendo.syncReady(function(){jQuery(&quot;#cboSucursal&quot;).kendoDropDownList({&quot;change&quot;:navheader_cboSucursal_change,&quot;dataBound&quot;:navheader_cboSucursal_databound,&quot;close&quot;:cbonavheader_close,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetSucursales&quot;,&quot;data&quot;:navheader_filterSucursal},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
              
              
              
                Centro de atenci??n
                Telef??nica [1]kendo.syncReady(function(){jQuery(&quot;#cboCentroAtencion&quot;).kendoDropDownList({&quot;dataBound&quot;:navheader_cboCentroAtencion_databound,&quot;close&quot;:cbonavheader_close,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;noDataTemplate&quot;:&quot;No se encontraron datos.&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/PerfilUsuario/PerfilUsuario/GetCentrosAtencion&quot;,&quot;data&quot;:navheader_filterCentroAtencion},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
              
              
              
                
                  
                     Guardar
                  
                
              
            
          
          
            
              
              Usuario Administrador
            
            
              
                
                
                Administrador, Usuario
                admin
                noreply@emmsa.net
                
                Sesi??n: 981497
                ??ltimo ingreso: 29/04/2022 16:38:44
                Ingreso anterior: 29/04/2022 16:32:39
              
              
              
                
                  
                     Cerrar sesi??n
                  
                
              
            
          
      
    
  




  
  
    
    
      
        
      
      
        Usuario Administrador
        admin
      
    

    
    
      CONTENIDO



    
      
         ??Gesti??n
        
          
        
      

      
        


    
      
         ??Consulta de movimientos
      
    
    
      
         ??Gestor de suscripci??n
      
    
    
      
         ??Tomadores
      
    
    
      
         ??Proceso Masivo
      
    
    
      
         ??Consulta de propuestas
      
    
    
      
         ??Propuestas en espera
      
    
    
      
         ??Propuestas aceptadas
      
    
    
      
         ??Propuestas ingresadas
      
    
    
      
         ??Monitor de distribuci??n
      
    
    
      
         ??Periodo de Cierre
      
    
    
      
         ??Reserva de numerador
      
    
    
      
         ??Vida Obligatorio
        
          
        
      

      
        


    
      
         ??AFIP Lote Vida Obligatorio
      
    
    
      
         ??Consulta AFIP por lote
      
    
    
      
         ??Consulta AFIP por contribuyente
      
    
    
      
         ??SSN Lote Kausay
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Consulta de marcas de gesti??n
      
    
    
      
         ??Consulta de Siniestros
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Infraestructura
        
          
        
      

      
        


    
      
         ??Configuraci??n del sistema   
        
          
        
      

      
        


    
      
         ??Campos de emisi??n
      
    
    
      
         ??Clases de nodo
      
    
    
      
         ??Conceptos
      
    
    
      
         ??Estados de cotizaci??n
      
    
    
      
         ??Origen Fecha Proceso
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Configuraci??n General
        
          
        
      

      
        


    
      
         ??Atributos
      
    
    
      
         ??Proceso Negocio
      
    
    
      
         ??Tipo Doc. Cond. Fiscal
      
    
    
      
         ??Tipos de nodo
      
    
    
      
         ??Validaciones
      
    
    
      
         ??Marcas de Gesti??n
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Emisi??n
        
          
        
      

      
        


    
      
         ??Ramos
      
    
    
      
         ??Subramos
      
    
    
      
         ??Riesgos
      
    
    
      
         ??Espec??fico
      
    
    
      
         ??Vigencias de contrato
      
    
    
      
         ??Planes comerciales
      
    
    
      
         ??Actividades
      
    
    
      
         ??Categor??as SSN
      
    
    
      
         ??Medidas de prestaci??n
      
    
    
      
         ??Productos
      
    
    
      
         ??Uso Bien Asegurado
      
    
    
      
         ??Tipo Bien Asegurado
      
    
    
      
         ??Grupo de Afinidad
      
    
    
      
         ??Rol Persona
      
    
    
      
         ??Motivo Excepci??n Inspecci??n
      
    
    
      
         ??Riesgo Adicional
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Propuestas
        
          
        
      

      
        


    
      
         ??Datos de propuesta
      
    
    
      
         ??Alcance de datos de propuesta
      
    
    
      
         ??Equipos de distribuci??n
      
    
    
      
         ??Reglas de distribuci??n
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Tarifarios
        
          
        
      

      
        


    
      
         ??AP - Descuento
      
    
    
      
         ??AP - Tasas
      
    
    
      
         ??Caucion Tasas
      
    
    
      
         ??Ramas Simples - Tasas
      
    
    
      
         ??Recargo Financiero
      
    
    
      
         ??Tarifario Transporte
        
          
        
      

      
        


    
      
         ??Tarifario transporte tasa
      
    
    
      
         ??Tarifario transporte custodia
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Tarifario Veh??culos
        
          
        
      

      
        


    
      
         ??Tarifario Veh??culos Accesorio
      
    
    
      
         ??Tarifario Veh??culos Adicional
      
    
    
      
         ??Tarifario Veh??culos Beneficio
      
    
    
      
         ??Tarifario Veh??culos Descuento Flota
      
    
    
      
         ??Tarifario Veh??culos Region
      
    
    
      
         ??Tarifario Veh??culos Riesgo Base
      
    
    
      
         ??Tarifario Veh??culos Riesgo Excepcion
      
    
    
      
         ??Tarifario Veh??culos Servicio
      
    
    
      
         ??Tarifario Veh??culos Zona
      
    
    
      
         ??Tarifario Veh??culos Inspecci??n
      
    
    
      
         ??Tarifarios Veh??culos Servicio Requiere
      
    
    
      
         ??Tarifario Ajuste de Prima
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Tarifario Inmuebles
        
          
        
      

      
        


    
      
         ??Tarifario Zona Sismica
      
    
    
      
         ??Tarifario Zona Inmueble
      
    
    
      
         ??Tarifario Zona Hurac??n
      
    
    
      
         ??Tarifario Zona Inspecci??n
      
    
    
      
         ??Tarifario Riesgo Base
      
    
    
      
         ??Tarifario Riesgo Excepci??n
      
    
    
      
         ??Tarifario Zona Siniestralidad
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Prima M??nima
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Coaseguro
        
          
        
      

      
        


    
      
         ??Brokers
      
    
    
      
         ??Compa????as de Seguros
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Cobranzas
        
          
        
      

      
        


    
      
         ??Tipos de pago
      
    
    
      
         ??Formas de pago
      
    
    
      
         ??Calendarios d??bitos
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Comercial
        
          
        
      

      
        


    
      
         ??Tipos de agente
      
    
    
      
         ??Agentes
      
    
    
      
         ??Ejecutivo Comercial
      
    
    
      
         ??Tipo Comisi??n
      
    
    
      
         ??Canal
      
    
    
      
         ??Subcanal
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Endosos
        
          
        
      

      
        


    
      
         ??Causas
      
    
    
      
         ??Grupos
      
    
    
      
         ??Tipos
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Anexos y cl??usulas
        
          
        
      

      
        


    
      
         ??Nodos
      
    
    
      
         ??Aplicaci??n
      
    
    
      
         ??Resoluci??n / Prove??do
      
    
    
      
         ??Tarifario Resoluci??n
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Impuestos
        
          
        
      

      
        


    
      
         ??Impuesto IIBB
      
    
    
      
         ??Impuesto Sellado
      
    
    
      
         ??Percepcion Iva
      
    
    
      
         ??Percepcion Iva Exclusion
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Cauci??n
        
          
        
      

      
        


    
      
         ??Avalistas
      
    
    
      
         ??Despachantes
      
    
    
      
         ??Obras
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Accidentes Personales
        
          
        
      

      
        


    
      
         ??Categor??a de actividad
      
    
    
      
         ??Rangos de edad
      
    
    
      
         ??Parentesco
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Autos
        
          
        
      

      
        


    
      
         ??Accesorio
      
    
    
      
         ??Adicional
      
    
    
      
         ??Beneficio
      
    
    
      
         ??Combustible
      
    
    
      
         ??Servicio
      
    
    
      
         ??Clase Veh??culos
      
    
    
      
         ??Clausula Ajuste Veh??culos
      
    
    
      
         ??Descuento Veh??culos
      
    
    
      
         ??Marca Veh??culos
      
    
    
      
         ??Modelo Veh??culos
      
    
    
      
         ??Kilometraje Veh??culos
      
    
    
      
         ??Familias de Veh??culos
      
    
    
      
         ??Destinos de Veh??culos
      
    
    
      
         ??Estado Veh??culos
      
    
    
      
         ??Grupos de Veh??culos
      
    
    
      
         ??Prestador de Veh??culos
      
    
    
      
         ??Regiones de Veh??culos
      
    
    
      
         ??Tipos de Veh??culos
      
    
    
      
         ??Zonas de Veh??culos 
      
    
    
      
         ??Carrocer??a
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Interfaces
        
          
        
      

      
        


    
      
         ??Web API
      
    
    
      
         ??Web API Key
      
    
    
      
         ??Web API Log
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Notificacion
        
          
        
      

      
        


    
      
         ??Env??o Notificacion
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Transporte
        
          
        
      

      
        


    
      
         ??Grupo de Mercaderias
      
    
    
      
         ??Mercader??as
      
    
    
      
         ??Riesgos de Transporte
      
    
    
      
         ??Tipos de Transporte
      
    
    
      
         ??Clases de Transporte
      
    
    
      
         ??Rutas de Transporte
      
    
    
      
         ??Tipo Punto Embarque
      
    
    
      
         ??Punto Embarque
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Certificados
        
          
        
      

      
        


    
      
         ??Tipos Certificados
      
    
    
      
         ??Certificado
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Inmuebles
        
          
        
      

      
        


    
      
         ??Agravante Inmueble
      
    
    
      
         ??Atenuante Inmueble
      
    
    
      
         ??Categoria Inmueble
      
    
    
      
         ??Zona Inmueble
      
    
    
      
         ??Zona Hurac??n
      
    
    
      
         ??Zona Siniestralidad
      
    
    
      
         ??Zona S??smica
      
    
    
      
         ??Sub-l??mite
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    
    
      
         ??Suscripci??n
        
          
        
      

      
        


    
      
         ??Grupo Suscripci??n
      
    
    
      
         ??Suscriptores
      
    
    
      
         ??Perfil Suscripci??n
      
    
    
      
         ????rea Suscripci??n
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
        
      
    


  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }



  var cntrlIsPressed = false;
  var shiftIsPressed = false;

  $(this).keydown(function (evt) {

    if (!evt) evt = event;

    if (evt.ctrlKey) {
      cntrlIsPressed = true;
    }
    if (evt.shiftKey) {
      shiftIsPressed = true;
    }
  });

  $(this).keyup(function (evt) {
    if (!evt) evt = event;

    cntrlIsPressed = false;
    shiftIsPressed = false;
  });

  function customOpenMenu(url) {
    if (shiftIsPressed) {
      if (url.includes('?'))
        url = url + &quot;&amp;modoDebug=1&quot;;
      else
        url = url + &quot;?modoDebug=1&quot;;
    }

    if (cntrlIsPressed) {
      window.open(url);
    }
    else {
      window.location.href = url;
    }

    cntrlIsPressed = false;
    shiftIsPressed = false;
  }

  // Fix Collapsed sidebar layout on mobile devices
  // Detail: https://github.com/almasaeed2010/AdminLTE/issues/1720
  $(document).on('click', '.sidebar-toggle', function () {
    if ($('body').hasClass(&quot;sidebar-collapse&quot;) &amp;&amp; $('body').hasClass(&quot;sidebar-open&quot;)) {
      $('body').removeClass(&quot;sidebar-collapse&quot;);
    }
  });

  $(document).ready(function () {

    // Active menu item with multilevel submenus: https://github.com/almasaeed2010/AdminLTE/issues/1482
    if (!addActiveMenuItem) {
      addActiveMenuItem = function addActiveMenuItem() {
        // Add active class and stay opened when selected
        var url = window.location;

        // For sidebar menu entirely but not cover treeview
        $('ul.sidebar-menu a').filter(function () {
          return this.href == url;
        }).parent().addClass('active');

        // For treeview
        $('ul.treeview-menu a').filter(function () {
          return this.href == url;
        }).parentsUntil(&quot;.sidebar-menu > .treeview-menu&quot;).addClass('active');
      }
    }

    addActiveMenuItem();
  });
    
  
  




  function adin_modal_overlay(msg, show) {
    $('#adinModal_Overlay .title').html(msg);
    if (show)
      $('#adinModal_Overlay').modal('show');
    else
      $('#adinModal_Overlay').modal('hide');
  }

  function adin_modal_simple_success(msg, event) {
    $('#adinModalSuccess_Simple').modal();
    $('#adinModalSuccess_Simple .title').html(msg);
    if (event) {
      $('#adinModalSuccess_Simple .McloseButton').attr(&quot;onclick&quot;, event);
    }
  }
  function adin_modal_simple(msg, event) {
    $('#adinModal_Simple').modal();
    $('#adinModal_Simple .title').html(msg);
    if (event) {
      $('#adinModal_Simple .McloseButton').attr(&quot;onclick&quot;, event);
    }
  }
  function adin_modal_confirmacion(msg, yesEvent, noEvent, yesText, noText) {

    $('#adinModal_Confirmacion').modal();
    $('#adinModal_Confirmacion .title').html(msg);

    if (yesText)
      $('#adinModal_Confirmacion .MNoButton').attr(&quot;value&quot;, yesText);
    if (noText)
      $('#adinModal_Confirmacion .MYesButton').attr(&quot;onclick&quot;, noText);
    if (yesEvent)
      $('#adinModal_Confirmacion .MYesButton').attr(&quot;onclick&quot;, yesEvent);
    if (yesEvent)
      $('#adinModal_Confirmacion .MNoButton').attr(&quot;onclick&quot;, noEvent);

  }




  
    
      
        
      
      
      
    
  


  
    
      
        
      
      
        Cerrar
      
    
  


  
    
      
        
      
      
        Cerrar
      
    
  


  
    
      
        
      
      
        S??
        No
      
    
  











  /* Fix: sidebar menu text not showing properly when decription is longer than width
       ...The alternative could be increasing side bar width: https://github.com/almasaeed2010/AdminLTE/issues/1336
       Both approaches may work together. */
  .sidebar-menu ul li a {
    white-space: normal;
    word-wrap: break-word;
  }


  /* Shadow in hovering for selector sistema menu */
  .nav > li > a:hover,
  .nav > li > a:active,
  .nav > li > a:focus {
    background: rgba(131,156,167,0.4) !important;
    color: white !important;
  }

  #selectorSistema > .user-header {
    padding: 15px;
    border-bottom: 1px solid #f4f4f4;
    border-top: 1px solid #dddddd;
    height: auto;
    color: white !important;
  }

    #selectorSistema > .user-header:hover {
      box-shadow: 3px 0 8px rgba(0, 0, 1, 0.125) !important;
      background: rgba(131,156,167,0.4) !important;
      color: black !important;
    }

  /* style for keeping user profile dropdown open */
  .stay-open {
    display: block !important;
  }

  .icon-perfil-usuario {
    font-size: initial !important;
    min-width: 20px !important;
  }
  .icon-perfil-usuario-small {
    min-width: 20px !important;
    font-size: .55em !important;
  }

  /* Fix look dropdown buttons */
  .navbar-nav > .user-menu > .dropdown-menu > .user-footer .btn-default {
    color: #666666 !important;
  }


      

      
      
        
        
          
            
              
                
                  
                  
                    
                      Toggle navigation
                      
                      
                      
                    
                    
                      
                        
    
  
  



                         Consulta de movimientos??
                        
    
  


                      
                      
                    
                  

                  
                  
                    
                      
    
  

    
        
            
            Ocultar filtros
        

        
            
                
                    Refrescar
                
        

    


  

  
    
    
      Refrescar
    
  

  
    
    ??B??sicos
  

  
    
    ??Avanzados
  
  
    
    ??Columnas
  

      
        
          
            Nuevo
          
        
        
          
        
      
      
          
            
              
              ????Presupuesto
            
          
          
            
              
              ????Propuesta
            
          
      
      
        function closePopoverExport_Nuevo() {
          $('#dropdownMenu_Nuevo').click();
        }

        $(document).ready(function () {
          $('#dropdownMenu_Nuevo').popover({
            sanitize: false,
            html: true,
            content: function () {
              return $('#dropdownContent_Nuevo').html();
            }
          });

          $('#dropdownMenu_Nuevo').on('shown.bs.popover', function () {
            $('[data-toggle=&quot;tooltip&quot;]').tooltip();
          });

          $('#dropdownMenu_Nuevo').on('hide.bs.popover', function () {
          });
        });
      


  
    
        
            
                Exportar
            
    

    
        
         
            Exportar
        
    

    



    
        
            
                
                .xlsx
            
        
        
            
                
            
        
    

    
        
            
                
                    0%
                
            
        
    







    function exportFile() {
        if (exportToExcel()) {
            loadProgressBar();
        }
    }

    function closePopoverExport() {
        $('#lnkExportar').click();
    }

    function txtFileNameOnKeyDown(e) {
        if (e.keyCode == 13) {
            exportFile();
            e.preventDefault();
        }
    }

    $(document).ready(function () {
        $(&quot;#lnkExportar&quot;).popover({
            sanitize: false,
            html: true,
            content: function () {
                return $(&quot;#divExportarContent&quot;).html();
            }
        });

        $('#lnkExportar').on('shown.bs.popover', function () {
            $('[data-toggle=&quot;tooltip&quot;]').tooltip();
            $(&quot;#txtFileName&quot;).val(hdnFileName.value);
        });

        $('#lnkExportar').on('hide.bs.popover', function () {
            hdnFileName.value = $(&quot;#txtFileName&quot;).val();
        });
    });

    function resetProgressBar() {
        $('.progress-bar').css('width', '0%').attr('aria-valuenow', 0);
    }

    function loadProgressBar() {
        var delay = 0;

        //Si est?? en 100%, la volvemos a cero antes de iniciar el progreso
        if ($('.progress-bar').attr('aria-valuenow') == 100) {
            resetProgressBar();
            delay = 300;
        }

        setTimeout(function () { $('.progress-bar').css('width', '100%').attr('aria-valuenow', 100); }, delay);
    }




    .popover {
        min-width: 300px;
        min-height: 100px;
    }





                    
                  
                
              

            

            
              
            
            
              ??
              
              
            

            
    
  



            
              
                
                Filtros
                
                  ??Limpiar
                
              
              
                
    
  


              
            

            
    
  


  
    
      
        
        
        
          
        
      
      
        
          

          Equipo Emisor AP (191)Jonatan Martin (34)Milagros Rigueras (154)Usuario Administrador (3)Equipo Emisor Autos e Inmuebles (425)Nora Nardi (425)Equipo Emisor Caucion (703)Jonatan Martin (436)Usuario Administrador (267)Equipo Emisor Hogar (65)Milagros Rigueras (65)Equipo Emisor Ramas Simples (35)Milagros Rigueras (35)EQUIPO INCENDIO (4)Nora Nardi (4)Equipo Suscripci??n AP (2)Martin Nu??ez (2)Equipo Suscriptor Hogar (2)Solange Soto (2)Equipo Suscriptores Caucion (2)Jonatan Martin (2)Equipo_Emisor_Transporte (21)Jonatan Martin (5)Usuario Administrador (16)EQUIPOS SEG_TEC (2110)Nora Nardi (2110)kendo.syncReady(function(){jQuery(&quot;#arbolPropuestas&quot;).kendoTreeView({&quot;check&quot;:checkTree,&quot;select&quot;:selectTree,&quot;dataBound&quot;:dataBoundArbol,&quot;autoBind&quot;:true,&quot;checkboxes&quot;:{&quot;checkChildren&quot;:true},&quot;dataTextField&quot;:[&quot;Text&quot;],&quot;loadOnDemand&quot;:true,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/ObtenerDistribucion&quot;}},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;model&quot;:{&quot;id&quot;:&quot;Id&quot;,&quot;hasChildren&quot;:&quot;HasChildren&quot;,&quot;children&quot;:&quot;Items&quot;}}}});});
        
      
    
  
  
    
        
          
            
              
              Filtros b??sicos
              
                ??Inicializar
              
            
            
                    
                      
                        Cotizaci??n
                        kendo.syncReady(function(){jQuery(&quot;#CotizacionId&quot;).kendoNumericTextBox({&quot;decimals&quot;:0,&quot;format&quot;:&quot;#&quot;,&quot;spinners&quot;:false});});
                      
                    
                    
                      
                        Grupo ramo
                        Todoskendo.syncReady(function(){jQuery(&quot;#GrupoRamoId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_gruporamoid&quot;,&quot;data&quot;:FiltroMovimiento_filter('gruporamoid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Ramo
                        CAUCION [1]kendo.syncReady(function(){jQuery(&quot;#RamoId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_ramoid&quot;,&quot;data&quot;:FiltroMovimiento_filter('ramoid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Subramo
                        Cauci??n [1]kendo.syncReady(function(){jQuery(&quot;#SubramoId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_subramoid&quot;,&quot;data&quot;:FiltroMovimiento_filter('subramoid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Estado cotizaci??n
                        
                        
                        Todoskendo.syncReady(function(){jQuery(&quot;#cbochk_EstadoCotizacionId&quot;).kendoDropDownList({&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;close&quot;:multiselect_close,&quot;change&quot;:FiltroMovimiento_change,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;template&quot;:&quot;\u003cinput type=\u0027checkbox\u0027 id=\u0027chk_EstadoCotizacionId_#=data.Id #\u0027 class=\u0027clsCheckInner_cbochk_EstadoCotizacionId\u0027 value=\u0027#=data.Id #\u0027 name=\u0027EstadoCotizacionId\u0027 /\u003e ${ data.Descripcion }&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_estadocotizacionid&quot;,&quot;data&quot;:FiltroMovimiento_filter('estadocotizacionid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        P??liza
                        kendo.syncReady(function(){jQuery(&quot;#Poliza&quot;).kendoTextBox({&quot;enable&quot;:true});});
                      
                    
                    
                      
                        N??mero endoso
                        kendo.syncReady(function(){jQuery(&quot;#NumeroEndoso&quot;).kendoTextBox({&quot;enable&quot;:true});});
                      
                    
                    
                      
                        N??mero propuesta externo
                        kendo.syncReady(function(){jQuery(&quot;#NumeroPropuestaExterno&quot;).kendoTextBox({&quot;enable&quot;:true});});
                      
                    
                    
                      
                        Moneda
                        Todoskendo.syncReady(function(){jQuery(&quot;#MonedaId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_monedaid&quot;,&quot;data&quot;:FiltroMovimiento_filter('monedaid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Productor principal
                        kendo.syncReady(function(){jQuery(&quot;#ProductorPrincipalId&quot;).kendoComboBox({&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;autoBind&quot;:true,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;enforceMinLength&quot;:true,&quot;minLength&quot;:3,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la b??squeda...&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_productorprincipalid&quot;,&quot;data&quot;:data_filter_productorprincipalid},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Inicio vigencia desde
                        kendo.syncReady(function(){jQuery(&quot;#FechaInicioVigenciaFROM&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Inicio vigencia hasta
                        kendo.syncReady(function(){jQuery(&quot;#FechaInicioVigenciaTO&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Fecha emisi??n desde
                        kendo.syncReady(function(){jQuery(&quot;#FechaHoraEmisionFROM&quot;).kendoDateTimePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy HH:mm}&quot;,&quot;timeFormat&quot;:&quot;HH:mm&quot;,&quot;value&quot;:new Date(2022,2,30,0,0,0,0)});});
                      
                    
                    
                      
                        Fecha emisi??n hasta
                        kendo.syncReady(function(){jQuery(&quot;#FechaHoraEmisionTO&quot;).kendoDateTimePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy HH:mm}&quot;,&quot;timeFormat&quot;:&quot;HH:mm&quot;});});
                      
                    
                    
                      
                        Tipo documento
                        Todoskendo.syncReady(function(){jQuery(&quot;#PersonaTipoDocumentoId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_personatipodocumentoid&quot;,&quot;data&quot;:FiltroMovimiento_filter('personatipodocumentoid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        N??mero documento
                        kendo.syncReady(function(){jQuery(&quot;#PersonaNumeroDocumento&quot;).kendoTextBox({&quot;enable&quot;:true});});
                      
                    
                    
                      
                        Apellido / Raz??n social
                        kendo.syncReady(function(){jQuery(&quot;#PersonaApellidoRazonSocial&quot;).kendoTextBox({&quot;enable&quot;:true});});
                      
                    
                    
                      
                        Nombre
                        kendo.syncReady(function(){jQuery(&quot;#PersonaNombre&quot;).kendoTextBox({&quot;enable&quot;:true});});
                      
                    
            
          
        

        
          
            
              
              Filtros avanzados
              
                ??Inicializar
              
            
            
                    
                      
                        Pa??s
                        Todoskendo.syncReady(function(){jQuery(&quot;#PersonaPaisId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_personapaisid&quot;,&quot;data&quot;:FiltroMovimiento_filter('personapaisid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Provincia
                        Todoskendo.syncReady(function(){jQuery(&quot;#PersonaProvinciaId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_personaprovinciaid&quot;,&quot;data&quot;:FiltroMovimiento_filter('personaprovinciaid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Localidad
                        kendo.syncReady(function(){jQuery(&quot;#PersonaLocalidadId&quot;).kendoComboBox({&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;autoBind&quot;:true,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;enforceMinLength&quot;:true,&quot;minLength&quot;:3,&quot;placeholder&quot;:&quot;Ingrese al menos 3 caracteres para la b??squeda...&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_personalocalidadid&quot;,&quot;data&quot;:data_filter_personalocalidadid},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Fecha propuesta desde
                        kendo.syncReady(function(){jQuery(&quot;#FechaPropuestaFROM&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Fecha propuesta hasta
                        kendo.syncReady(function(){jQuery(&quot;#FechaPropuestaTO&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Fecha presupuesto  desde
                        kendo.syncReady(function(){jQuery(&quot;#FechaPresupuestoFROM&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Fecha presupuesto  hasta
                        kendo.syncReady(function(){jQuery(&quot;#FechaPresupuestoTO&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Fin vigencia  desde
                        kendo.syncReady(function(){jQuery(&quot;#FechaFinVigenciaFROM&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Fin vigencia  hasta
                        kendo.syncReady(function(){jQuery(&quot;#FechaFinVigenciaTO&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Inicio contrato  desde
                        kendo.syncReady(function(){jQuery(&quot;#FechaInicioContratoFROM&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Inicio contrato  hasta
                        kendo.syncReady(function(){jQuery(&quot;#FechaInicioContratoTO&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Fin contrato  desde
                        kendo.syncReady(function(){jQuery(&quot;#FechaFinContratoFROM&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Fin contrato  hasta
                        kendo.syncReady(function(){jQuery(&quot;#FechaFinContratoTO&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Tipo emisi??n
                        
                        
                        Todoskendo.syncReady(function(){jQuery(&quot;#cbochk_TipoEmisionId&quot;).kendoDropDownList({&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;close&quot;:multiselect_close,&quot;change&quot;:FiltroMovimiento_change,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;template&quot;:&quot;\u003cinput type=\u0027checkbox\u0027 id=\u0027chk_TipoEmisionId_#=data.Id #\u0027 class=\u0027clsCheckInner\u0027 value=\u0027#=data.Id #\u0027 name=\u0027TipoEmisionId\u0027 /\u003e ${ data.Descripcion }&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_tipoemisionid&quot;,&quot;data&quot;:FiltroMovimiento_filter('tipoemisionid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Proceso negocio
                        
                        
                        Todoskendo.syncReady(function(){jQuery(&quot;#cbochk_ProcesoNegocioId&quot;).kendoDropDownList({&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;close&quot;:multiselect_close,&quot;change&quot;:FiltroMovimiento_change,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;template&quot;:&quot;\u003cinput type=\u0027checkbox\u0027 id=\u0027chk_ProcesoNegocioId_#=data.Id #\u0027 class=\u0027clsCheckInner\u0027 value=\u0027#=data.Id #\u0027 name=\u0027ProcesoNegocioId\u0027 /\u003e ${ data.Descripcion }&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_procesonegocioid&quot;,&quot;data&quot;:FiltroMovimiento_filter('procesonegocioid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Unidad operativa
                        Todoskendo.syncReady(function(){jQuery(&quot;#UnidadOperativaId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_unidadoperativaid&quot;,&quot;data&quot;:FiltroMovimiento_filter('unidadoperativaid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Sucursal
                        Todoskendo.syncReady(function(){jQuery(&quot;#SucursalId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_sucursalid&quot;,&quot;data&quot;:FiltroMovimiento_filter('sucursalid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Centro de atenci??n
                        Todoskendo.syncReady(function(){jQuery(&quot;#CentroAtencionId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_centroatencionid&quot;,&quot;data&quot;:FiltroMovimiento_filter('centroatencionid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Unidad de negocio
                        Todoskendo.syncReady(function(){jQuery(&quot;#UnidadNegocioId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_unidadnegocioid&quot;,&quot;data&quot;:FiltroMovimiento_filter('unidadnegocioid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Centro de costo
                        Todoskendo.syncReady(function(){jQuery(&quot;#CentroCostoId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_centrocostoid&quot;,&quot;data&quot;:FiltroMovimiento_filter('centrocostoid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Canal
                        Todoskendo.syncReady(function(){jQuery(&quot;#CanalId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_canalid&quot;,&quot;data&quot;:FiltroMovimiento_filter('canalid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Subcanal
                        Todoskendo.syncReady(function(){jQuery(&quot;#SubcanalId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_subcanalid&quot;,&quot;data&quot;:FiltroMovimiento_filter('subcanalid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Cotizaci??n origen
                        kendo.syncReady(function(){jQuery(&quot;#CotizacionOrigenId&quot;).kendoNumericTextBox({&quot;decimals&quot;:0,&quot;format&quot;:&quot;#&quot;,&quot;spinners&quot;:false});});
                      
                    
                    
                      
                        Producto
                        Todoskendo.syncReady(function(){jQuery(&quot;#ProductoId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_productoid&quot;,&quot;data&quot;:FiltroMovimiento_filter('productoid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Subproducto
                        Todoskendo.syncReady(function(){jQuery(&quot;#SubproductoId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_subproductoid&quot;,&quot;data&quot;:FiltroMovimiento_filter('subproductoid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Vigencia contrato
                        Todoskendo.syncReady(function(){jQuery(&quot;#VigenciaId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_vigenciaid&quot;,&quot;data&quot;:FiltroMovimiento_filter('vigenciaid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Forma de pago
                        Todoskendo.syncReady(function(){jQuery(&quot;#FormaPagoId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_formapagoid&quot;,&quot;data&quot;:FiltroMovimiento_filter('formapagoid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Grupo afinidad
                        Todoskendo.syncReady(function(){jQuery(&quot;#GrupoAfinidadId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_grupoafinidadid&quot;,&quot;data&quot;:FiltroMovimiento_filter('grupoafinidadid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Plan comercial
                        Todoskendo.syncReady(function(){jQuery(&quot;#PlanComercialId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_plancomercialid&quot;,&quot;data&quot;:FiltroMovimiento_filter('plancomercialid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        Plan cuotas
                        Todoskendo.syncReady(function(){jQuery(&quot;#PlanCuotaId&quot;).kendoDropDownList({&quot;change&quot;:FiltroMovimiento_change,&quot;dataBound&quot;:FiltroMovimiento_databound,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;enable&quot;:true,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_plancuotaid&quot;,&quot;data&quot;:FiltroMovimiento_filter('plancuotaid')},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                      
                    
                    
                      
                        N??mero factura
                        kendo.syncReady(function(){jQuery(&quot;#NumeroFactura&quot;).kendoTextBox({&quot;enable&quot;:true});});
                      
                    
                    
                      
                        Fecha factura desde
                        kendo.syncReady(function(){jQuery(&quot;#FechaFacturaFROM&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Fecha factura hasta
                        kendo.syncReady(function(){jQuery(&quot;#FechaFacturaTO&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Per??odo cubierto
                        kendo.syncReady(function(){jQuery(&quot;#PeriodoCubierto&quot;).kendoNumericTextBox({&quot;decimals&quot;:0,&quot;format&quot;:&quot;#&quot;,&quot;spinners&quot;:false});});
                      
                    
                    
                      
                        C??digo seguimiento SSN
                        kendo.syncReady(function(){jQuery(&quot;#CodigoSeguimientoSSN&quot;).kendoTextBox({&quot;enable&quot;:true});});
                      
                    
                  
                    
                      Estructura comercial
                      

                      
                      

                      ??NuevoTipoProductorNo hay registroskendo.syncReady(function(){jQuery(&quot;#grdFilterProductores&quot;).kendoGrid({&quot;save&quot;:UpdateFilterProductores,&quot;edit&quot;:EditFilterProductores,&quot;navigatable&quot;:true,&quot;noRecords&quot;:{&quot;template&quot;:&quot;\u003cspan style=\u0027width:98%;\u0027 class=\u0027no-records-text\u0027\u003eNo hay registros\u003c/span\u003e&quot;},&quot;columns&quot;:[{&quot;attributes&quot;:{&quot;style&quot;:&quot;white-space: nowrap&quot;,&quot;class&quot;:&quot;editable&quot;},&quot;width&quot;:&quot;43px&quot;,&quot;command&quot;:[{&quot;attr&quot;:&quot; title=\&quot;Eliminar\&quot;&quot;,&quot;text&quot;:&quot;\u003ci class=\&quot;fas fa-times\&quot; aria-hidden=\&quot;true\&quot;\u003e\u003c/i\u003e&quot;,&quot;name&quot;:&quot;Eliminar&quot;,&quot;click&quot;:QuitarProductor}]},{&quot;title&quot;:&quot;Tipo&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;,&quot;class&quot;:&quot;editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;width&quot;:&quot;350px&quot;,&quot;template&quot;:&quot;#= !! TipoProductorDescripcion ? TipoProductorDescripcion : \u0027\u0027 #&quot;,&quot;field&quot;:&quot;TipoProductorId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\u003cinput data-val=\&quot;true\&quot; data-val-required=\&quot;The Tipo Productor Id field is required.\&quot; id=\&quot;TipoProductorId\&quot; name=\&quot;TipoProductorId\&quot; style=\&quot;width:100%; min-width:100px;\&quot; type=\&quot;text\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#TipoProductorId\&quot;).kendoDropDownList({\&quot;dataTextField\&quot;:\&quot;Descripcion\&quot;,\&quot;dataValueField\&quot;:\&quot;Id\&quot;,\&quot;enforceMinLength\&quot;:true,\&quot;minLength\&quot;:3,\&quot;optionLabel\&quot;:\&quot;Seleccione\&quot;,\&quot;dataSource\&quot;:{\&quot;transport\&quot;:{\&quot;read\&quot;:{\&quot;url\&quot;:\&quot;/AdInsurance/Emision/Gestion/Movimiento/GetTiposProductor\&quot;,\&quot;data\&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(\&quot;#TipoProductorId\&quot;)); }},\&quot;prefix\&quot;:\&quot;\&quot;},\&quot;serverFiltering\&quot;:true,\&quot;filter\&quot;:[],\&quot;schema\&quot;:{\&quot;errors\&quot;:\&quot;Errors\&quot;}}});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;TipoProductorId\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;,&quot;values&quot;:[{&quot;text&quot;:&quot;Cadete&quot;,&quot;value&quot;:&quot;6&quot;},{&quot;text&quot;:&quot;Intermediario&quot;,&quot;value&quot;:&quot;5&quot;},{&quot;text&quot;:&quot;Organizador&quot;,&quot;value&quot;:&quot;3&quot;},{&quot;text&quot;:&quot;Productor&quot;,&quot;value&quot;:&quot;1&quot;},{&quot;text&quot;:&quot;Productor Assek&quot;,&quot;value&quot;:&quot;68&quot;},{&quot;text&quot;:&quot;Sub-Organizador&quot;,&quot;value&quot;:&quot;67&quot;},{&quot;text&quot;:&quot;SubProductor&quot;,&quot;value&quot;:&quot;2&quot;},{&quot;text&quot;:&quot;Vinculante&quot;,&quot;value&quot;:&quot;4&quot;}]},{&quot;title&quot;:&quot;Productor&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: left;&quot;,&quot;class&quot;:&quot;editable&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;text-align: left; font-weight: bold;&quot;},&quot;template&quot;:&quot; #= !! Descripcion ? Descripcion : \u0027\u0027 # &quot;,&quot;field&quot;:&quot;Id&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true,&quot;editor&quot;:&quot;\r\n\r\n\u003cscript type=\&quot;text/javascript\&quot;\u003e\r\n  var currentProductorId;\r\n\r\n  function databound_filter_productores(e) {\r\n    if (currentProductorId) {\r\n      if (e.sender)\r\n        e.sender.dataSource.read();\r\n    }\r\n  }\r\n\r\n  function data_filter_productores(e) {\r\n    let filterValue = e.filter.filters.length \u003e 0 ? e.filter.filters[0].value : \u0027\u0027;\r\n    let prodId = null;\r\n\r\n    if (currentProductorId) {\r\n      prodId = currentProductorId;\r\n      currentProductorId = null;\r\n    }\r\n\r\n    return {\r\n      productorFilter: filterValue,\r\n\t\t\tproductorId: prodId\r\n    };\r\n  }\r\n\r\n\u003c/script\u003e\r\n\r\n\u003cinput id=\&quot;Id\&quot; name=\&quot;Id\&quot; style=\&quot;width: 100%\&quot; type=\&quot;text\&quot; value=\&quot;\&quot; /\u003e\u003cscript\u003ekendo.syncReady(function(){jQuery(\&quot;#Id\&quot;).kendoComboBox({\&quot;change\&quot;:UpdateFilterProductoresId,\&quot;dataBound\&quot;:databound_filter_productores,\&quot;autoBind\&quot;:true,\&quot;dataTextField\&quot;:\&quot;Descripcion\&quot;,\&quot;dataValueField\&quot;:\&quot;Id\&quot;,\&quot;minLength\&quot;:3,\&quot;placeholder\&quot;:\&quot;Ingrese al menos 3 caracteres para la b??squeda...\&quot;,\&quot;filter\&quot;:\&quot;contains\&quot;,\&quot;dataSource\&quot;:{\&quot;transport\&quot;:{\&quot;read\&quot;:{\&quot;url\&quot;:\&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_Productores\&quot;,\&quot;data\&quot;:data_filter_productores},\&quot;prefix\&quot;:\&quot;\&quot;},\&quot;serverFiltering\&quot;:true,\&quot;filter\&quot;:[],\&quot;schema\&quot;:{\&quot;errors\&quot;:\&quot;Errors\&quot;}}});});\u003c/script\u003e\u003cspan class=\&quot;field-validation-valid\&quot; data-valmsg-for=\&quot;Id\&quot; data-valmsg-replace=\&quot;true\&quot;\u003e\u003c/span\u003e&quot;}],&quot;scrollable&quot;:false,&quot;editable&quot;:{&quot;confirmation&quot;:false,&quot;confirmDelete&quot;:&quot;Delete&quot;,&quot;cancelDelete&quot;:&quot;Cancel&quot;,&quot;mode&quot;:&quot;incell&quot;,&quot;create&quot;:true,&quot;update&quot;:true,&quot;destroy&quot;:true,&quot;template&quot;:null},&quot;toolbar&quot;:&quot;\u003cbutton type=\u0027button\u0027 class=\u0027k-button\u0027 onclick=\u0027AgregarProductor()\u0027 title=\u0027Nuevo filtro de productor\u0027\u003e\u003cspan\u003e\u003ci class=\u0027fa fa-file\u0027\u003e\u003c/i\u003e\u0026nbsp;Nuevo\u003c/span\u003e\u003c/button\u003e\u003c/div\u003e&quot;,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/grdFilterProductores_Read&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;error&quot;:error_handler,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;ModoPreview&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;Productores&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Productores_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Productores_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Id&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Descripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;TipoProductorId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;TipoProductorDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DistribucionAutomatica&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;DistribucionAutomatica_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;DistribucionAutomatica_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ProductorComisiones&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;AllTipoProductor&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;Comisiones&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;NuevoProductorId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;BajaProductorId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null}}}}}});});
                    
                  
                    
                      
                        Fecha creaci??n desde
                        kendo.syncReady(function(){jQuery(&quot;#FechaInsertFROM&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Fecha creaci??n hasta
                        kendo.syncReady(function(){jQuery(&quot;#FechaInsertTO&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Fecha modificaci??n desde
                        kendo.syncReady(function(){jQuery(&quot;#FechaUpdateFROM&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Fecha modificaci??n hasta
                        kendo.syncReady(function(){jQuery(&quot;#FechaUpdateTO&quot;).kendoDatePicker({&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
                      
                    
                    
                      
                        Usuario creaci??n
                        kendo.syncReady(function(){jQuery(&quot;#UsuarioInsert&quot;).kendoTextBox({&quot;enable&quot;:true});});
                      
                    
                    
                      
                        Usuario modificaci??n
                        kendo.syncReady(function(){jQuery(&quot;#UsuarioUpdate&quot;).kendoTextBox({&quot;enable&quot;:true});});
                      
                    
            
          
        


        
          
            
            Columnas
          
          

              
                
                Cotizaci??n
              
              
                
                Empresa id
              
              
                
                Empresa
              
              
                
                Grupo ramo id
              
              
                
                Grupo ramo
              
              
                
                Ramo id
              
              
                
                Ramo
              
              
                
                Subramo id
              
              
                
                Subramo
              
              
                
                Tipo emisi??n id
              
              
                
                Tipo emisi??n
              
              
                
                Proceso negocio id
              
              
                
                Proceso negocio
              
              
                
                Grupo endoso id
              
              
                
                Grupo endoso
              
              
                
                Tipo endoso id
              
              
                
                Tipo endoso
              
              
                
                Causa endoso id
              
              
                
                Causa endoso
              
              
                
                Cotizaci??n origen
              
              
                
                P??liza origen id
              
              
                
                P??liza id
              
              
                
                P??liza
              
              
                
                N??mero endoso
              
              
                
                Renovada por
              
              
                
                Renueva a
              
              
                
                Fecha emisi??n
              
              
                
                N??mero factura
              
              
                
                Fecha factura
              
              
                
                Numero CAE
              
              
                
                Vencimiento CAE
              
              
                
                Fecha propuesta
              
              
                
                N??mero propuesta
              
              
                
                N??mero propuesta externo
              
              
                
                Fecha presupuesto
              
              
                
                Inicio vigencia
              
              
                
                Fin vigencia
              
              
                
                Inicio contrato
              
              
                
                Fin contrato
              
              
                
                Per??odo cubierto
              
              
                
                Productor principal id
              
              
                
                Productor principal
              
              
                
                Organizador
              
              
                
                Vinculante
              
              
                
                Canal id
              
              
                
                Canal
              
              
                
                Subcanal id
              
              
                
                Subcanal
              
              
                
                Producto id
              
              
                
                Producto
              
              
                
                SubProductoId
              
              
                
                Subproducto
              
              
                
                Forma de pago id
              
              
                
                Forma de pago
              
              
                
                Grupo de afinidad id
              
              
                
                Grupo de afinidad
              
              
                
                Plan comercial id
              
              
                
                Plan comercial
              
              
                
                Plan de cuota id
              
              
                
                Plan de cuota
              
              
                
                Tomador
              
              
                
                Tomador documento
              
              
                
                Asegurado
              
              
                
                Asegurado documento
              
              
                
                Vigencia contrato id
              
              
                
                Vigencia contrato
              
              
                
                Moneda id
              
              
                
                Moneda
              
              
                
                Cambio utilizado
              
              
                
                Suma asegurada total
              
              
                
                Prima dep??sito
              
              
                
                Prima comercial
              
              
                
                Premio
              
              
                
                Valor cuota
              
              
                
                Estado cotizaci??n id
              
              
                
                Estado cotizaci??n
              
              
                
                Estado resumen
              
              
                
                Estado impresi??n id
              
              
                
                Estado impresi??n
              
              
                
                Estado p??liza id
              
              
                
                Estado p??liza
              
              
                
                C??digo de seguimiento SSN
              
              
                
                Estado pr??rroga id
              
              
                
                Estado pr??rroga
              
              
                
                Equipo distribuci??n id
              
              
                
                Equipo distribuci??n
              
              
                
                Usuario distribuci??n
              
              
                
                Unidad operativa id
              
              
                
                Unidad operativa
              
              
                
                Sucursal id
              
              
                
                Sucursal
              
              
                
                Centro atenci??n id
              
              
                
                Centro atenci??n
              
              
                
                Unidad de negocio id
              
              
                
                Unidad de negocio
              
              
                
                Centro costo id
              
              
                
                Centro de costo
              
              
                
                Usuario creaci??n
              
              
                
                Fecha creaci??n
              
              
                
                Usuario modificaci??n
              
              
                
                Fecha modificaci??n
              
          
        
    
  





            
              
                


































  
  



  
    Cotizaci??nEmpresa idEmpresaGrupo ramo idGrupo ramoRamo idRamoSubramo idSubramoTipo emisi??n idTipo emisi??nProceso negocio idProceso negocioGrupo endoso idGrupo endosoTipo endoso idTipo endosoCausa endoso idCausa endosoCotizaci??n origenP??liza origen idP??liza idP??lizaN??mero endosoRenovada porRenueva aFecha emisi??nN??mero facturaFecha facturaNumero CAEVencimiento CAEFecha propuestaN??mero propuestaN??mero propuesta externoFecha presupuestoInicio vigenciaFin vigenciaInicio contratoFin contratoPer??odo cubiertoProductor principal idProductor principalOrganizadorVinculanteCanal idCanalSubcanal idSubcanalProducto idProductoSubProductoIdSubproductoForma de pago idForma de pagoGrupo de afinidad idGrupo de afinidadPlan comercial idPlan comercialPlan de cuota idPlan de cuotaTomadorTomador documentoAseguradoAsegurado documentoVigencia contrato idVigencia contratoMoneda idMonedaCambio utilizadoSuma asegurada totalPrima dep??sitoPrima comercialPremioValor cuotaEstado cotizaci??n idEstado cotizaci??nEstado resumenEstado impresi??n idEstado impresi??nEstado p??liza idEstado p??lizaC??digo de seguimiento SSNEstado pr??rroga idEstado pr??rrogaEquipo distribuci??n idEquipo distribuci??nUsuario distribuci??nUnidad operativa idUnidad operativaSucursal idSucursalCentro atenci??n idCentro atenci??nUnidad de negocio idUnidad de negocioCentro costo idCentro de costoUsuario creaci??nFecha creaci??nUsuario modificaci??nFecha modificaci??n2437081Meridional Seguros1Cauci??n1CAUCION1Cauci??n1Manual1P??liza Nueva1462800000009210100000029/04/2022 10:1329/04/202229/04/202229/04/202229/08/202229/04/202229/04/202339039VIDAL ADANO, IGNACIO3ANTICIPO FINANCIERO3ANTICIPO FINANCIERO39CUPON2Plan Abierto[object HTMLInputElement]1 Cuota-ContadoBETULAR, DAMIANDNI 38991713ESPOSITO, LALIDNI 162090944Cuatrimestral (2 Prgas)1Pesos1,002.999.999,003.506,084.323,354.323,3514EmitidaVigente1No requiere env??o por mail1Vigente2Pendiente1La Meridional1Casa Central1Telef??nica1Local7682.11.1.0 - Contractualesadmin29/04/2022 10:13admin29/04/2022 10:132437071Meridional Seguros1Cauci??n1CAUCION1Cauci??n1Manual1P??liza Nueva1462700000009210000000029/04/2022 10:0929/04/202229/04/202229/04/202229/08/202229/04/202229/04/202339039VIDAL ADANO, IGNACIO3ANTICIPO FINANCIERO3ANTICIPO FINANCIERO39CUPON2Plan Abierto[object HTMLInputElement]1 Cuota-ContadoBETULAR, DAMIANDNI 38991713ESPOSITO, LALIDNI 162090944Cuatrimestral (2 Prgas)1Pesos1,002.999.999,003.506,084.323,354.323,3514EmitidaVigente1No requiere env??o por mail1Vigente2Pendiente1La Meridional1Casa Central1Telef??nica1Local7682.11.1.0 - Contractualesadmin29/04/2022 10:09admin29/04/2022 10:092437061Meridional Seguros1Cauci??n1CAUCION1Cauci??n1Manual1P??liza Nueva1462600000009209900000029/04/2022 10:0529/04/202229/04/202229/04/202229/08/202229/04/202229/04/202339039VIDAL ADANO, IGNACIO3ANTICIPO FINANCIERO3ANTICIPO FINANCIERO39CUPON2Plan Abierto[object HTMLInputElement]1 Cuota-ContadoBETULAR, DAMIANDNI 38991713ESPOSITO, LALIDNI 162090944Cuatrimestral (2 Prgas)1Pesos1,002.999.999,003.506,084.323,354.323,3514EmitidaVigente1No requiere env??o por mail1Vigente2Pendiente1La Meridional1Casa Central1Telef??nica1Local7682.11.1.0 - Contractualesadmin29/04/2022 10:05admin29/04/2022 10:052437021Meridional Seguros1Cauci??n1CAUCION1Cauci??n1Manual1P??liza Nueva28/04/2022 18:5928/04/202228/04/202228/04/202228/08/202239039VIDAL ADANO, IGNACIO3ANTICIPO FINANCIERO3ANTICIPO FINANCIERO39CUPON2Plan Abierto[object HTMLInputElement]1 Cuota-ContadoBETULAR, DAMIANDNI 38991713ESPOSITO, LALIDNI 162090944Cuatrimestral (2 Prgas)1Pesos1,002.999.999,003.506,084.323,354.323,357PresupuestadaVigente1No requiere env??o por mail1La Meridional1Casa Central1Telef??nica1Local - admin28/04/2022 18:59admin28/04/2022 18:592437011Meridional Seguros1Cauci??n1CAUCION1Cauci??n1Manual1P??liza Nueva28/04/2022 18:5628/04/202228/04/202228/04/202228/08/202239039VIDAL ADANO, IGNACIO3ANTICIPO FINANCIERO3ANTICIPO FINANCIERO39CUPON2Plan Abierto[object HTMLInputElement]1 Cuota-ContadoBETULAR, DAMIANDNI 38991713ESPOSITO, LALIDNI 162090944Cuatrimestral (2 Prgas)1Pesos1,002.999.999,003.506,084.323,354.323,357PresupuestadaVigente1No requiere env??o por mail1La Meridional1Casa Central1Telef??nica1Local - admin28/04/2022 18:56admin28/04/2022 18:562436971Meridional Seguros1Cauci??n1CAUCION1Cauci??n1Manual1P??liza Nueva28/04/2022 16:2828/04/202228/04/202228/04/202228/08/202239039VIDAL ADANO, IGNACIO3ANTICIPO FINANCIERO3ANTICIPO FINANCIERO39CUPON2Plan Abierto[object HTMLInputElement]1 Cuota-ContadoBETULAR, DAMIANDNI 38991713ESPOSITO, LALIDNI 162090944Cuatrimestral (2 Prgas)1Pesos1,002.999.999,003.506,084.323,354.323,357PresupuestadaVigente1No requiere env??o por mail1La Meridional1Casa Central1Telef??nica1Local - admin28/04/2022 16:28admin28/04/2022 16:282436961Meridional Seguros1Cauci??n1CAUCION1Cauci??n1Manual1P??liza Nueva1462300000009209800000028/04/2022 16:2528/04/202228/04/202228/04/202228/08/202228/04/202228/04/202339039VIDAL ADANO, IGNACIO3ANTICIPO FINANCIERO3ANTICIPO FINANCIERO39CUPON2Plan Abierto[object HTMLInputElement]1 Cuota-ContadoBETULAR, DAMIANDNI 38991713ESPOSITO, LALIDNI 162090944Cuatrimestral (2 Prgas)1Pesos1,002.999.999,003.506,084.323,354.323,3514EmitidaVigente1No requiere env??o por mail1Vigente2Pendiente1La Meridional1Casa Central1Telef??nica1Local7682.11.1.0 - Contractualesadmin28/04/2022 16:25admin28/04/2022 16:252436941Meridional Seguros1Cauci??n1CAUCION1Cauci??n1Manual1P??liza Nueva1462100000009209700000028/04/2022 15:2728/04/202228/04/202228/04/202228/08/202228/04/202228/04/202339039VIDAL ADANO, IGNACIO3ANTICIPO FINANCIERO3ANTICIPO FINANCIERO39CUPON2Plan Abierto[object HTMLInputElement]1 Cuota-ContadoBETULAR, DAMIANDNI 38991713ESPOSITO, LALIDNI 162090944Cuatrimestral (2 Prgas)1Pesos1,002.999.999,003.506,084.323,354.323,3514EmitidaVigente1No requiere env??o por mail1Vigente2Pendiente1La Meridional1Casa Central1Telef??nica1Local7682.11.1.0 - Contractualesadmin28/04/2022 15:27admin28/04/2022 15:272436931Meridional Seguros1Cauci??n1CAUCION1Cauci??n1Manual1P??liza Nueva1462000000009209600000028/04/2022 14:5128/04/202228/04/202228/04/202228/04/202328/04/202228/04/202338994MCLURE, TROYCHAVEZ, PAULA - 9876543ANTICIPO FINANCIERO3ANTICIPO FINANCIERO39CUPON2Plan Abierto[object HTMLInputElement]1 Cuota-ContadoRIVERO, MILAGROS DNI 41891842RIVERO, MILAGROS DNI 418918423Anual1Pesos1,002.999.999,003.780,004.653,184.653,1814EmitidaVigente1No requiere env??o por mail1Vigente1No lleva1La Meridional1Casa Central1Telef??nica1Local7682.11.1.0 - Contractualesadmin28/04/2022 14:51admin28/04/2022 14:512436921Meridional Seguros1Cauci??n1CAUCION1Cauci??n1Manual4Endoso2Modificaciones varias8Reducci??n de suma asegurada118Por pedido productor/Cliente243688146191461900000009209500000128/04/2022 14:3528/04/202228/04/202228/04/202228/04/202328/04/202228/04/202338994MCLURE, TROYCHAVEZ, PAULA - 9876543ANTICIPO FINANCIERO3ANTICIPO FINANCIERO39CUPON2Plan Abierto[object HTMLInputElement]1 Cuota-ContadoRIVERO, MILAGROS DNI 41891842RIVERO, MILAGROS DNI 418918423Anual1Pesos1,0087.500,00-11,03-13,59-13,5914EmitidaVigente1No requiere env??o por mail1Vigente1No lleva1La Meridional1Casa Central1Telef??nica1Local7682.11.1.0 - Contractualesadmin28/04/2022 14:35admin28/04/2022 14:3512345678910M??s paginas12345678910...10102050100??tems por p??ginaElementos mostrados 1 - 10 de 200kendo.syncReady(function(){jQuery(&quot;#grdConsultaMovimiento&quot;).kendoGrid({&quot;dataBound&quot;:grdConsultaMovimiento_DataBound,&quot;excelExport&quot;:formatExcelExportCM,&quot;autoBind&quot;:false,&quot;excel&quot;:{&quot;allPages&quot;:true,&quot;fileName&quot;:&quot;Consulta de movimientos&quot;,&quot;filterable&quot;:true},&quot;noRecords&quot;:{&quot;template&quot;:&quot;\u003cspan style=\u0027width:98%;\u0027 class=\u0027no-records-text\u0027\u003ePor favor valorice los filtros deseados y luego presione refrescar.\u003c/span\u003e&quot;},&quot;sortable&quot;:{&quot;showIndexes&quot;:true,&quot;mode&quot;:&quot;multiple&quot;},&quot;columns&quot;:[{&quot;attributes&quot;:{&quot;style&quot;:&quot;white-space: nowrap&quot;},&quot;width&quot;:&quot;43px&quot;,&quot;command&quot;:[{&quot;attr&quot;:&quot; class=\&quot;k-font-icon\&quot; title=\&quot;Mostrar men\u0026#xFA;\&quot;&quot;,&quot;text&quot;:&quot;\u003ci class=\&quot;fas fa-bars\&quot; aria-hidden=\&quot;true\&quot;\u003e\u003c/i\u003e&quot;,&quot;name&quot;:&quot;Mostrar men??&quot;,&quot;click&quot;:MostrarMenu}]},{&quot;title&quot;:&quot;Cotizacion Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;CotizacionId&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= CotizacionId != null ? CotizacionId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eCotizaci??n\u003c/span\u003e&quot;,&quot;field&quot;:&quot;CotizacionId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Empresa Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;EmpresaId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EmpresaId != null ? EmpresaId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eEmpresa id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EmpresaId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Empresa Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;EmpresaDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EmpresaDescripcion != null ? EmpresaDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eEmpresa\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EmpresaDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Grupo Ramo Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;GrupoRamoId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= GrupoRamoId != null ? GrupoRamoId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eGrupo ramo id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;GrupoRamoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Grupo Ramo Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;GrupoRamoDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= GrupoRamoDescripcion != null ? GrupoRamoDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eGrupo ramo\u003c/span\u003e&quot;,&quot;field&quot;:&quot;GrupoRamoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Ramo Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;RamoId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= RamoId != null ? RamoId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eRamo id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;RamoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Ramo Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;RamoDescripcion&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= RamoDescripcion != null ? RamoDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eRamo\u003c/span\u003e&quot;,&quot;field&quot;:&quot;RamoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Subramo Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;SubramoId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= SubramoId != null ? SubramoId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eSubramo id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;SubramoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Subramo Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;SubramoDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= SubramoDescripcion != null ? SubramoDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eSubramo\u003c/span\u003e&quot;,&quot;field&quot;:&quot;SubramoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Tipo Emision Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;TipoEmisionId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= TipoEmisionId != null ? TipoEmisionId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eTipo emisi??n id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;TipoEmisionId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Tipo Emision Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;TipoEmisionDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= TipoEmisionDescripcion != null ? TipoEmisionDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eTipo emisi??n\u003c/span\u003e&quot;,&quot;field&quot;:&quot;TipoEmisionDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Proceso Negocio Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;ProcesoNegocioId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= ProcesoNegocioId != null ? ProcesoNegocioId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eProceso negocio id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;ProcesoNegocioId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Proceso Negocio Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;ProcesoNegocioDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= ProcesoNegocioDescripcion != null ? ProcesoNegocioDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eProceso negocio\u003c/span\u003e&quot;,&quot;field&quot;:&quot;ProcesoNegocioDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Grupo Endoso Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;GrupoEndosoId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= GrupoEndosoId != null ? GrupoEndosoId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eGrupo endoso id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;GrupoEndosoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Grupo Endoso Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;GrupoEndosoDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= GrupoEndosoDescripcion != null ? GrupoEndosoDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eGrupo endoso\u003c/span\u003e&quot;,&quot;field&quot;:&quot;GrupoEndosoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Tipo Endoso Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;TipoEndosoId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= TipoEndosoId != null ? TipoEndosoId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eTipo endoso id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;TipoEndosoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Tipo Endoso Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;TipoEndosoDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= TipoEndosoDescripcion != null ? TipoEndosoDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eTipo endoso\u003c/span\u003e&quot;,&quot;field&quot;:&quot;TipoEndosoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Causa Endoso Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;CausaEndosoId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= CausaEndosoId != null ? CausaEndosoId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eCausa endoso id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;CausaEndosoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Causa Endoso Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;CausaEndosoDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= CausaEndosoDescripcion != null ? CausaEndosoDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eCausa endoso\u003c/span\u003e&quot;,&quot;field&quot;:&quot;CausaEndosoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Cotizacion Origen Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;CotizacionOrigenId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= CotizacionOrigenId != null ? CotizacionOrigenId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eCotizaci??n origen\u003c/span\u003e&quot;,&quot;field&quot;:&quot;CotizacionOrigenId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Poliza Origen Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;PolizaOrigenId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= PolizaOrigenId != null ? PolizaOrigenId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eP??liza origen id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PolizaOrigenId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Poliza Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;PolizaId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= PolizaId != null ? PolizaId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eP??liza id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PolizaId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Poliza&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;Poliza&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= Poliza != null ? Poliza : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eP??liza\u003c/span\u003e&quot;,&quot;field&quot;:&quot;Poliza&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Numero Endoso&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;NumeroEndoso&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= NumeroEndoso != null ? NumeroEndoso : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eN??mero endoso\u003c/span\u003e&quot;,&quot;field&quot;:&quot;NumeroEndoso&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Renovada Por&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;RenovadaPor&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= RenovadaPor != null ? RenovadaPor : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eRenovada por\u003c/span\u003e&quot;,&quot;field&quot;:&quot;RenovadaPor&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Renueva A&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;RenuevaA&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= RenuevaA != null ? RenuevaA : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eRenueva a\u003c/span\u003e&quot;,&quot;field&quot;:&quot;RenuevaA&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Fecha Hora Emision&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;FechaHoraEmision&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FechaHoraEmision != null ? kendo.toString(kendo.parseDate(FechaHoraEmision),\u0027dd/MM/yyyy HH:mm\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eFecha emisi??n\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FechaHoraEmision&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Numero Factura&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;NumeroFactura&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= NumeroFactura != null ? NumeroFactura : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eN??mero factura\u003c/span\u003e&quot;,&quot;field&quot;:&quot;NumeroFactura&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Fecha Factura&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;FechaFactura&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FechaFactura != null ? kendo.toString(kendo.parseDate(FechaFactura),\u0027dd/MM/yyyy\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eFecha factura\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FechaFactura&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Numero Cae&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;NumeroCae&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= NumeroCae != null ? NumeroCae : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eNumero CAE\u003c/span\u003e&quot;,&quot;field&quot;:&quot;NumeroCae&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Fecha Vencimiento Cae&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;FechaVencimientoCae&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FechaVencimientoCae != null ? kendo.toString(kendo.parseDate(FechaVencimientoCae),\u0027dd/MM/yyyy\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eVencimiento CAE\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FechaVencimientoCae&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Fecha Propuesta&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;FechaPropuesta&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FechaPropuesta != null ? kendo.toString(kendo.parseDate(FechaPropuesta),\u0027dd/MM/yyyy\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eFecha propuesta\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FechaPropuesta&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Numero Propuesta&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;NumeroPropuesta&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= NumeroPropuesta != null ? NumeroPropuesta : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eN??mero propuesta\u003c/span\u003e&quot;,&quot;field&quot;:&quot;NumeroPropuesta&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Numero Propuesta Externo&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;NumeroPropuestaExterno&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= NumeroPropuestaExterno != null ? NumeroPropuestaExterno : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eN??mero propuesta externo\u003c/span\u003e&quot;,&quot;field&quot;:&quot;NumeroPropuestaExterno&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Fecha Presupuesto&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;FechaPresupuesto&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FechaPresupuesto != null ? kendo.toString(kendo.parseDate(FechaPresupuesto),\u0027dd/MM/yyyy\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eFecha presupuesto\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FechaPresupuesto&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Fecha Inicio Vigencia&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;FechaInicioVigencia&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FechaInicioVigencia != null ? kendo.toString(kendo.parseDate(FechaInicioVigencia),\u0027dd/MM/yyyy\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eInicio vigencia\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FechaInicioVigencia&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Fecha Fin Vigencia&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;FechaFinVigencia&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FechaFinVigencia != null ? kendo.toString(kendo.parseDate(FechaFinVigencia),\u0027dd/MM/yyyy\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eFin vigencia\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FechaFinVigencia&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Fecha Inicio Contrato&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;FechaInicioContrato&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FechaInicioContrato != null ? kendo.toString(kendo.parseDate(FechaInicioContrato),\u0027dd/MM/yyyy\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eInicio contrato\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FechaInicioContrato&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Fecha Fin Contrato&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;FechaFinContrato&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FechaFinContrato != null ? kendo.toString(kendo.parseDate(FechaFinContrato),\u0027dd/MM/yyyy\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eFin contrato\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FechaFinContrato&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Periodo Cubierto&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;PeriodoCubierto&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= PeriodoCubierto != null ? PeriodoCubierto : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003ePer??odo cubierto\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PeriodoCubierto&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Productor Principal Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;ProductorPrincipalId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= ProductorPrincipalId != null ? ProductorPrincipalId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eProductor principal id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;ProductorPrincipalId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Productor Principal Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;ProductorPrincipalDescripcion&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= ProductorPrincipalDescripcion != null ? ProductorPrincipalDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eProductor principal\u003c/span\u003e&quot;,&quot;field&quot;:&quot;ProductorPrincipalDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Organizador&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;Organizador&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= Organizador != null ? Organizador : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eOrganizador\u003c/span\u003e&quot;,&quot;field&quot;:&quot;Organizador&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Vinculante&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;Vinculante&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= Vinculante != null ? Vinculante : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eVinculante\u003c/span\u003e&quot;,&quot;field&quot;:&quot;Vinculante&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Canal Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;CanalId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= CanalId != null ? CanalId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eCanal id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;CanalId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Canal Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;CanalDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= CanalDescripcion != null ? CanalDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eCanal\u003c/span\u003e&quot;,&quot;field&quot;:&quot;CanalDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Subcanal Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;SubcanalId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= SubcanalId != null ? SubcanalId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eSubcanal id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;SubcanalId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Subcanal Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;SubcanalDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= SubcanalDescripcion != null ? SubcanalDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eSubcanal\u003c/span\u003e&quot;,&quot;field&quot;:&quot;SubcanalDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Producto Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;ProductoId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= ProductoId != null ? ProductoId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eProducto id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;ProductoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Producto Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;ProductoDescripcion&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= ProductoDescripcion != null ? ProductoDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eProducto\u003c/span\u003e&quot;,&quot;field&quot;:&quot;ProductoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Subproducto Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;SubproductoId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= SubproductoId != null ? SubproductoId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eSubProductoId\u003c/span\u003e&quot;,&quot;field&quot;:&quot;SubproductoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Subproducto Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;SubproductoDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= SubproductoDescripcion != null ? SubproductoDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eSubproducto\u003c/span\u003e&quot;,&quot;field&quot;:&quot;SubproductoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Forma Pago Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;FormaPagoId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FormaPagoId != null ? FormaPagoId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eForma de pago id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FormaPagoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Forma Pago Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;FormaPagoDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FormaPagoDescripcion != null ? FormaPagoDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eForma de pago\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FormaPagoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Grupo Afinidad Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;GrupoAfinidadId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= GrupoAfinidadId != null ? GrupoAfinidadId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eGrupo de afinidad id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;GrupoAfinidadId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Grupo Afinidad Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;GrupoAfinidadDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= GrupoAfinidadDescripcion != null ? GrupoAfinidadDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eGrupo de afinidad\u003c/span\u003e&quot;,&quot;field&quot;:&quot;GrupoAfinidadDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Plan Comercial Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;PlanComercialId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= PlanComercialId != null ? PlanComercialId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003ePlan comercial id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PlanComercialId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Plan Comercial Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;PlanComercialDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= PlanComercialDescripcion != null ? PlanComercialDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003ePlan comercial\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PlanComercialDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Plan Cuota Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;PlanCuotaId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= PlanCuotaId != null ? PlanCuotaId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003ePlan de cuota id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PlanCuotaId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Plan Cuota Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;PlanCuotaDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= PlanCuotaDescripcion != null ? PlanCuotaDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003ePlan de cuota\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PlanCuotaDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Persona Tomador Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;PersonaTomadorDescripcion&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= PersonaTomadorDescripcion != null ? PersonaTomadorDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eTomador\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PersonaTomadorDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Persona Tomador Documento&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;PersonaTomadorDocumento&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= PersonaTomadorDocumento != null ? PersonaTomadorDocumento : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eTomador documento\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PersonaTomadorDocumento&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Persona Asegurado Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;PersonaAseguradoDescripcion&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= PersonaAseguradoDescripcion != null ? PersonaAseguradoDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eAsegurado\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PersonaAseguradoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Persona Asegurado Documento&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;PersonaAseguradoDocumento&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= PersonaAseguradoDocumento != null ? PersonaAseguradoDocumento : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eAsegurado documento\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PersonaAseguradoDocumento&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Vigencia Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;VigenciaId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= VigenciaId != null ? VigenciaId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eVigencia contrato id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;VigenciaId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Vigencia Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;VigenciaDescripcion&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= VigenciaDescripcion != null ? VigenciaDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eVigencia contrato\u003c/span\u003e&quot;,&quot;field&quot;:&quot;VigenciaDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Moneda Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;MonedaId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= MonedaId != null ? MonedaId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eMoneda id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;MonedaId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Moneda Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;MonedaDescripcion&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= MonedaDescripcion != null ? MonedaDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eMoneda\u003c/span\u003e&quot;,&quot;field&quot;:&quot;MonedaDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Cambio Utilizado&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;CambioUtilizado&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= CambioUtilizado != null ? kendo.toString(kendo.parseInt(CambioUtilizado),\u0027n2\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eCambio utilizado\u003c/span\u003e&quot;,&quot;field&quot;:&quot;CambioUtilizado&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Suma Asegurada Total&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;SumaAseguradaTotal&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= SumaAseguradaTotal != null ? kendo.toString(kendo.parseFloat(SumaAseguradaTotal),\u0027n2\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eSuma asegurada total\u003c/span\u003e&quot;,&quot;field&quot;:&quot;SumaAseguradaTotal&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Monto Prima Deposito&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;MontoPrimaDeposito&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= MontoPrimaDeposito != null ? kendo.toString(kendo.parseFloat(MontoPrimaDeposito),\u0027n2\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003ePrima dep??sito\u003c/span\u003e&quot;,&quot;field&quot;:&quot;MontoPrimaDeposito&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Prima Comercial&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;PrimaComercial&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= PrimaComercial != null ? kendo.toString(kendo.parseFloat(PrimaComercial),\u0027n2\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003ePrima comercial\u003c/span\u003e&quot;,&quot;field&quot;:&quot;PrimaComercial&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Premio&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;Premio&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= Premio != null ? kendo.toString(kendo.parseFloat(Premio),\u0027n2\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003ePremio\u003c/span\u003e&quot;,&quot;field&quot;:&quot;Premio&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Valor Cuota&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;ValorCuota&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= ValorCuota != null ? kendo.toString(kendo.parseFloat(ValorCuota),\u0027n2\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eValor cuota\u003c/span\u003e&quot;,&quot;field&quot;:&quot;ValorCuota&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Estado Cotizacion Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;EstadoCotizacionId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EstadoCotizacionId != null ? EstadoCotizacionId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eEstado cotizaci??n id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EstadoCotizacionId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Estado Cotizacion Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;EstadoCotizacionDescripcion&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EstadoCotizacionDescripcion != null ? EstadoCotizacionDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eEstado cotizaci??n\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EstadoCotizacionDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Estado Resumen Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;EstadoResumenDescripcion&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EstadoResumenDescripcion != null ? EstadoResumenDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eEstado resumen\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EstadoResumenDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Estado Impresion Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;EstadoImpresionId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EstadoImpresionId != null ? EstadoImpresionId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eEstado impresi??n id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EstadoImpresionId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Estado Impresion Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;EstadoImpresionDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EstadoImpresionDescripcion != null ? EstadoImpresionDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eEstado impresi??n\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EstadoImpresionDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Estado Poliza Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;EstadoPolizaId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EstadoPolizaId != null ? EstadoPolizaId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eEstado p??liza id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EstadoPolizaId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Estado Poliza Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;EstadoPolizaDescripcion&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EstadoPolizaDescripcion != null ? EstadoPolizaDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eEstado p??liza\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EstadoPolizaDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Codigo Seguimiento SSN&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;CodigoSeguimientoSSN&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= CodigoSeguimientoSSN != null ? CodigoSeguimientoSSN : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eC??digo de seguimiento SSN\u003c/span\u003e&quot;,&quot;field&quot;:&quot;CodigoSeguimientoSSN&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Estado Prorroga Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;EstadoProrrogaId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EstadoProrrogaId != null ? EstadoProrrogaId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eEstado pr??rroga id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EstadoProrrogaId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Estado Prorroga Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;EstadoProrrogaDescripcion&quot;},&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EstadoProrrogaDescripcion != null ? EstadoProrrogaDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eEstado pr??rroga\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EstadoProrrogaDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Equipo Distribucion Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;EquipoDistribucionId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EquipoDistribucionId != null ? EquipoDistribucionId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eEquipo distribuci??n id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EquipoDistribucionId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Equipo Distribucion Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;EquipoDistribucionDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= EquipoDistribucionDescripcion != null ? EquipoDistribucionDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eEquipo distribuci??n\u003c/span\u003e&quot;,&quot;field&quot;:&quot;EquipoDistribucionDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Usuario Distribucion Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;UsuarioDistribucionDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= UsuarioDistribucionDescripcion != null ? UsuarioDistribucionDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eUsuario distribuci??n\u003c/span\u003e&quot;,&quot;field&quot;:&quot;UsuarioDistribucionDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Unidad Operativa Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;UnidadOperativaId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= UnidadOperativaId != null ? UnidadOperativaId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eUnidad operativa id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;UnidadOperativaId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Unidad Operativa Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;UnidadOperativaDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= UnidadOperativaDescripcion != null ? UnidadOperativaDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eUnidad operativa\u003c/span\u003e&quot;,&quot;field&quot;:&quot;UnidadOperativaDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Sucursal Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;SucursalId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= SucursalId != null ? SucursalId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eSucursal id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;SucursalId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Sucursal Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;SucursalDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= SucursalDescripcion != null ? SucursalDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eSucursal\u003c/span\u003e&quot;,&quot;field&quot;:&quot;SucursalDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Centro Atencion Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;CentroAtencionId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= CentroAtencionId != null ? CentroAtencionId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eCentro atenci??n id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;CentroAtencionId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Centro Atencion Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;CentroAtencionDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= CentroAtencionDescripcion != null ? CentroAtencionDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eCentro atenci??n\u003c/span\u003e&quot;,&quot;field&quot;:&quot;CentroAtencionDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Unidad Negocio Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;UnidadNegocioId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= UnidadNegocioId != null ? UnidadNegocioId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eUnidad de negocio id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;UnidadNegocioId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Unidad Negocio Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;UnidadNegocioDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= UnidadNegocioDescripcion != null ? UnidadNegocioDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eUnidad de negocio\u003c/span\u003e&quot;,&quot;field&quot;:&quot;UnidadNegocioDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Centro Costo Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:right;&quot;,&quot;id&quot;:&quot;CentroCostoId&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= CentroCostoId != null ? CentroCostoId : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;R\u0027 title=\u0027\u0027\u003eCentro costo id\u003c/span\u003e&quot;,&quot;field&quot;:&quot;CentroCostoId&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Centro Costo Descripcion&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;,&quot;id&quot;:&quot;CentroCostoDescripcion&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= CentroCostoDescripcion != null ? CentroCostoDescripcion : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;L\u0027 title=\u0027\u0027\u003eCentro de costo\u003c/span\u003e&quot;,&quot;field&quot;:&quot;CentroCostoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Usuario Insert&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;UsuarioInsert&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= UsuarioInsert != null ? UsuarioInsert : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eUsuario creaci??n\u003c/span\u003e&quot;,&quot;field&quot;:&quot;UsuarioInsert&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Fecha Insert&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;FechaInsert&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FechaInsert != null ? kendo.toString(kendo.parseDate(FechaInsert),\u0027dd/MM/yyyy HH:mm\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eFecha creaci??n\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FechaInsert&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Usuario Update&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;UsuarioUpdate&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= UsuarioUpdate != null ? UsuarioUpdate : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eUsuario modificaci??n\u003c/span\u003e&quot;,&quot;field&quot;:&quot;UsuarioUpdate&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Fecha Update&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;,&quot;id&quot;:&quot;FechaUpdate&quot;},&quot;hidden&quot;:true,&quot;template&quot;:&quot;\u003cspan class=\u0027#= MonedaEstilo #\u0027\u003e#= FechaUpdate != null ? kendo.toString(kendo.parseDate(FechaUpdate),\u0027dd/MM/yyyy HH:mm\u0027) : \u0027\u0027 #\u003c/span\u003e&quot;,&quot;headerTemplate&quot;:&quot;\u003cspan style=\u0027font-weight:bold;C\u0027 title=\u0027\u0027\u003eFecha modificaci??n\u003c/span\u003e&quot;,&quot;field&quot;:&quot;FechaUpdate&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;autoBind&quot;:false,&quot;refresh&quot;:true,&quot;pageSizes&quot;:[10,20,50,100],&quot;buttonCount&quot;:10},&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;}},&quot;scrollable&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/grdConsultaMovimiento_Read&quot;,&quot;data&quot;:getConsultaViewModel},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:10,&quot;page&quot;:1,&quot;groupPaging&quot;:false,&quot;total&quot;:0,&quot;sort&quot;:[{&quot;field&quot;:&quot;CotizacionId&quot;,&quot;dir&quot;:&quot;desc&quot;}],&quot;error&quot;:grdConsultaMovimiento_Error,&quot;requestStart&quot;:grdConsultaMovimiento_RequestStart,&quot;requestEnd&quot;:grdConsultaMovimiento_RequestEnd,&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{}}}});});
  



  
    
    Tiempo de consulta: 0.569 seg.
    Tiempo de respuesta: 4.25 seg.
    
  
  
    Cantidad de registros a consultar: 
  
  
    kendo.syncReady(function(){jQuery(&quot;#TopeRegistros&quot;).kendoNumericTextBox({&quot;decimals&quot;:0,&quot;format&quot;:&quot;n0&quot;,&quot;spinners&quot;:false});});
  



  

    
      
        ??
        Seleccione un endoso
      

      

        
          ??
          
        

        
          
          
            
              Grupo de endoso:
            
            
              Todoskendo.syncReady(function(){jQuery(&quot;#cboGrupoEndoso&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetGruposEndoso&quot;,&quot;data&quot;:filterGrupoEndoso},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
            
          
          
          
            
              Endoso:
            
            
              Todoskendo.syncReady(function(){jQuery(&quot;#cboTipoEndoso&quot;).kendoDropDownList({&quot;change&quot;:cboTipoEndosoModal_change,&quot;cascadeFrom&quot;:&quot;cboGrupoEndoso&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetTiposEndoso&quot;,&quot;data&quot;:filterTipoEndoso},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
            
          
          
          
            
              Causa:
            
            
              Todoskendo.syncReady(function(){jQuery(&quot;#cboTipoEndosoCausa&quot;).kendoDropDownList({&quot;dataBound&quot;:cboTipoEndosoCausa_databound,&quot;cascadeFrom&quot;:&quot;cboTipoEndoso&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetTipoEndosoCausas&quot;,&quot;data&quot;:filterTipoEndosoCausa},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
            
          
          
          
          
          
        
        
          Cancelar
          Continuar >>
        
      

    
  



  

    
      
        ??
        Seleccione subramo
      

      

        
          ??
          
        

        
          
            
              Ramo:
            
            
              Seleccionekendo.syncReady(function(){jQuery(&quot;#cboRamo&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_RamoId&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#cboRamo&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
            
          
          
          
            
              Subramo:
            
            
              Seleccionekendo.syncReady(function(){jQuery(&quot;#cboSubramo&quot;).kendoDropDownList({&quot;cascadeFrom&quot;:&quot;cboRamo&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetFilter_SubramoId&quot;,&quot;data&quot;:filterSeleccionSubramo},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
            
          
          
        
        
          Cancelar
          Continuar >>
        
      

    
  



  
    
      
        ??
        Seleccione un movimiento
      

      
        
          ??
          
        

        
          
            
              
                Usuario:
                kendo.syncReady(function(){jQuery(&quot;#txtFiltroUsuario&quot;).kendoTextBox({&quot;value&quot;:&quot;admin&quot;});});
              
            
            
              
                Id:
                kendo.syncReady(function(){jQuery(&quot;#txtFiltroId&quot;).kendoNumericTextBox({&quot;change&quot;:refreshSeleccionMovimiento,&quot;decimals&quot;:0,&quot;format&quot;:&quot;#&quot;,&quot;spinners&quot;:false});});
              
            
            
              
                Fecha desde:
                kendo.syncReady(function(){jQuery(&quot;#txtFiltroFechaDesde&quot;).kendoDatePicker({&quot;change&quot;:refreshSeleccionMovimiento,&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;,&quot;value&quot;:new Date(2022,3,29,0,0,0,0)});});
              
            
            
              
                Fecha hasta:
                kendo.syncReady(function(){jQuery(&quot;#txtFiltroFechaHasta&quot;).kendoDatePicker({&quot;change&quot;:refreshSeleccionMovimiento,&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;});});
              
            
          
          
            IdFechaUsuarioRamoSubramoProceso negocioTipo operaci??nEstado609167229/04/2022adminACCIDENTES PERSONALESDM (Negocios Masivos)P??liza NuevaAltaPresupuestada609167129/04/2022adminACCIDENTES PERSONALESDM (Negocios Masivos)P??liza NuevaAltaPresupuestada609167029/04/2022adminACCIDENTES PERSONALESDM (Negocios Masivos)P??liza NuevaConsultaEmitida609166929/04/2022adminACCIDENTES PERSONALESDM (Negocios Masivos)P??liza NuevaAltaPresupuestada609166829/04/2022adminACCIDENTES PERSONALESDM (Negocios Masivos)P??liza NuevaAltaIncompleta12345M??s paginas12345...55101525??tems por p??ginaElementos mostrados 1 - 5 de 31kendo.syncReady(function(){jQuery(&quot;#grdSeleccionMovimiento&quot;).kendoGrid({&quot;dataBound&quot;:grdSeleccionMovimiento_databound,&quot;noRecords&quot;:{&quot;template&quot;:&quot;\u003cspan class=\u0027no-records-text\u0027\u003eNo se encontraron registros con el criterio de b??squeda ingresado.\u003cspan\u003e&quot;},&quot;sortable&quot;:true,&quot;columns&quot;:[{&quot;attributes&quot;:{&quot;style&quot;:&quot;white-space: nowrap&quot;},&quot;width&quot;:&quot;43px&quot;,&quot;command&quot;:[{&quot;attr&quot;:&quot; title=\&quot;Abrir\&quot; href=\&quot;#\&quot;&quot;,&quot;text&quot;:&quot;\u003ci class=\&quot;fas fa-check-circle\&quot; aria-hidden=\&quot;true\&quot;\u003e\u003c/i\u003e&quot;,&quot;name&quot;:&quot;Seleccionar&quot;,&quot;click&quot;:verMovimiento},{&quot;attr&quot;:&quot; title=\&quot;Visualizar\&quot; href=\&quot;#\&quot;&quot;,&quot;text&quot;:&quot;\u003ci class=\&quot;fa fa-search\&quot; aria-hidden=\&quot;true\&quot;\u003e\u003c/i\u003e&quot;,&quot;name&quot;:&quot;Ver&quot;,&quot;click&quot;:visualizarMovimiento}]},{&quot;title&quot;:&quot;Id&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align: right;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: right;&quot;},&quot;field&quot;:&quot;Id&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Fecha&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:center;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: center;&quot;},&quot;field&quot;:&quot;FechaMovimiento&quot;,&quot;format&quot;:&quot;{0:dd/MM/yyyy}&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Usuario&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: left;&quot;},&quot;field&quot;:&quot;UsuarioMovimiento&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Ramo&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: left;&quot;},&quot;field&quot;:&quot;RamoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Subramo&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: left;&quot;},&quot;field&quot;:&quot;SubRamoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Proceso negocio&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: left;&quot;},&quot;field&quot;:&quot;ProcesoNegocioDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Tipo operaci??n&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: left;&quot;},&quot;field&quot;:&quot;TipoOperacionDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true},{&quot;title&quot;:&quot;Estado&quot;,&quot;attributes&quot;:{&quot;style&quot;:&quot;text-align:left;&quot;},&quot;headerAttributes&quot;:{&quot;style&quot;:&quot;font-weight : bold; text-align: left;&quot;},&quot;field&quot;:&quot;EstadoMovimientoDescripcion&quot;,&quot;filterable&quot;:{&quot;messages&quot;:{&quot;selectedItemsFormat&quot;:&quot;{0} selected items&quot;},&quot;checkAll&quot;:false},&quot;encoded&quot;:true}],&quot;pageable&quot;:{&quot;refresh&quot;:true,&quot;responsive&quot;:false,&quot;pageSizes&quot;:[5,10,15,25],&quot;buttonCount&quot;:5},&quot;scrollable&quot;:false,&quot;dataSource&quot;:{&quot;type&quot;:(function(){if(kendo.data.transports['aspnetmvc-ajax']){return 'aspnetmvc-ajax';} else{throw new Error('The kendo.aspnetmvc.min.js script is not included.');}})(),&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/grdSeleccionMovimiento_Read&quot;,&quot;data&quot;:filterSeleccionMovimiento},&quot;prefix&quot;:&quot;&quot;},&quot;pageSize&quot;:5,&quot;page&quot;:1,&quot;groupPaging&quot;:false,&quot;total&quot;:0,&quot;sort&quot;:[{&quot;field&quot;:&quot;Id&quot;,&quot;dir&quot;:&quot;desc&quot;}],&quot;schema&quot;:{&quot;data&quot;:&quot;Data&quot;,&quot;total&quot;:&quot;Total&quot;,&quot;errors&quot;:&quot;Errors&quot;,&quot;model&quot;:{&quot;fields&quot;:{&quot;Id&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;EmpresaId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;EmpresaDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EmpresaPaisId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;RamoId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;RamoDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;SubRamoId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;SubRamoDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ProcesoNegocioId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;ProcesoNegocioDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EsRehabilitacion&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;TipoOperacionId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;TipoOperacionDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;TipoEmisionId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;TipoEmisionDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;GrupoEndosoId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;GrupoEndosoDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;TipoEndosoId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;TipoEndosoDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;CotizacionId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;CotizacionOrigenId&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;NumeroPoliza&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;NumeroEndoso&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;NumeroPolizaOrigen&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;NumeroEndosoOrigen&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EstadoCotizacionId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;EstadoCotizacionNombre&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EstadoCotizacionDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EstadoCotizacionPermiteModificacion&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;EstadoMovimientoDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;EstadoCotizacionRequiereMotivo&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;FechaMovimiento&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;UsuarioMovimiento&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;FechaCotizacion&quot;:{&quot;type&quot;:&quot;date&quot;,&quot;defaultValue&quot;:null},&quot;UsuarioCotizacion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ProductoVigenciaId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;SubProductoId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;EquipoDistribucionDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;UsuarioDistribucionDescripcion&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PrimaComercial&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;PrimaComercial_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;PrimaComercial_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Premio&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;Premio_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Premio_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ValorCuota&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;ValorCuota_Titulo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ValorCuota_Visibilidad&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MonedaSimbolo&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;NumeroPropuesta&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AplicaEnPropuesta&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;PolizaCredito&quot;:{&quot;type&quot;:&quot;number&quot;,&quot;defaultValue&quot;:null},&quot;EstadoPolizaPermiteImprimir&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;ActionOrigen&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;AreaOrigen&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ConsultaMovimientoId&quot;:{&quot;type&quot;:&quot;number&quot;},&quot;ConsultaMovimientoNombre&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ConsultaMovimientoFilters&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ConsultaMovimientoColumns&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;ModoPreview&quot;:{&quot;type&quot;:&quot;boolean&quot;},&quot;MensajesError&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;MensajeMovimiento&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;Validaciones&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;SolapasEmision&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;EstadosGuardarPropuesta&quot;:{&quot;type&quot;:&quot;object&quot;},&quot;DistintaEmpresa&quot;:{&quot;type&quot;:&quot;boolean&quot;}}}}}});});
          
        
        
        
        
      

    
  



  

    
      
        ??
        Seleccione cotizaci??n (opcional)
      

      

        
          ??
          
        

        
          
            
              Cotizaci??n:
            
            
              kendo.syncReady(function(){jQuery(&quot;#txtCotizacionConsultaId&quot;).kendoNumericTextBox({&quot;decimals&quot;:0,&quot;format&quot;:&quot;#&quot;,&quot;spinners&quot;:false});});
            
          
          
        
        
          Continuar >>
        
      
    
  



    
        
            
                
                    Redistribuir
                
                
                  
                    
                      0%kendo.syncReady(function(){jQuery(&quot;#progressRedistribucion&quot;).kendoProgressBar({&quot;animation&quot;:true,&quot;enable&quot;:true,&quot;reverse&quot;:false,&quot;showStatus&quot;:true,&quot;type&quot;:&quot;percent&quot;});});
                    
                    
                  
                  
                
                
                    Ok
                
            
        
    



    
        
            
                
                    Reasignar
                
                
                    
                        
                            
                                Equipo Distribuci??n??
                                Seleccionekendo.syncReady(function(){jQuery(&quot;#EquipoDistribucionIdReasignar&quot;).kendoDropDownList({&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetEquiposDistribucion&quot;,&quot;data&quot;:function() { return kendo.ui.DropDownList.requestData(jQuery(&quot;#EquipoDistribucionIdReasignar&quot;)); }},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                            
                        
                        
                            
                                Usuario Distribuci??n??
                                Seleccionekendo.syncReady(function(){jQuery(&quot;#UsuarioDistribucionIdReasignar&quot;).kendoDropDownList({&quot;cascadeFrom&quot;:&quot;EquipoDistribucionIdReasignar&quot;,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Seleccione&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Infraestructura/EquipoDistribucion/GetUsuariosByEquipo&quot;,&quot;data&quot;:filterUsuarioDistribucion},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
                            
                        
                    
                
                
                    Cerrar
                    Reasignar
                
            
        
    



  kendo.syncReady(function(){jQuery(&quot;#mnuCotizacion&quot;).kendoContextMenu({&quot;select&quot;:SeleccionarOpcionMenu,&quot;open&quot;:mnuCotizacion_Open,&quot;close&quot;:HideOpcionMenu,&quot;filter&quot;:&quot;td[role=\u0027gridcell\u0027]&quot;,&quot;target&quot;:&quot;#grdConsultaMovimiento&quot;,&quot;animation&quot;:{&quot;open&quot;:{&quot;duration&quot;:500,&quot;effects&quot;:&quot;fade:in&quot;}}});});

kendo.syncReady(function(){jQuery(&quot;#grdConsultaMovimiento&quot;).kendoTooltip({&quot;autoHide&quot;:false,&quot;position&quot;:&quot;left&quot;,&quot;filter&quot;:&quot;.tooltipCAE&quot;,&quot;content&quot;:getTooltipCAE});});





  function mostrarModalImpresion(cotizacionImpresionId, extraParamsQS, permiteImprimir) {
    $(&quot;#cboDestinatarios&quot;).getKendoDropDownList().value(null);
    $(&quot;#cboDestinatarios&quot;).getKendoDropDownList().dataSource.data([]);

    $('#hdnCotizacionImpresionId').val(cotizacionImpresionId);
    $('#hdnExtraParamsQS').val(extraParamsQS);
    $('#divFormularios')[0].innerHTML = '';
    $(&quot;#spanFormularios&quot;).css(&quot;visibility&quot;, &quot;hidden&quot;);

    if (!permiteImprimir) {
      $(&quot;#divNoPermiteImprimir&quot;).removeClass(&quot;hidden&quot;);
      SetOpcionImprimirDisable(true);
    }
    else {
      $(&quot;#divNoPermiteImprimir&quot;).addClass(&quot;hidden&quot;);
      SetOpcionImprimirDisable(false);
    }

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

    let urlImprimir = &quot;/AdInsurance/Emision/Gestion/Movimiento/ImprimirCotizacion&quot; + &quot;?cotizacionId=&quot; + cotizacionImpresionId + (formsIds.length > 0 ? &quot;&amp;formsIds=&quot; + formsIds.join(',') : &quot;&quot;) + &quot;&amp;&quot; + $('#hdnExtraParamsQS').val();
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










  

    
      
        ??
        Selecci??n de destinatario y formularios
      

      

        
          ??
          
        

        
          
          
            
              Destinatario:
            
            
              Todoskendo.syncReady(function(){jQuery(&quot;#cboDestinatarios&quot;).kendoDropDownList({&quot;change&quot;:cargarFormulariosImpresion,&quot;dataTextField&quot;:&quot;Descripcion&quot;,&quot;dataValueField&quot;:&quot;ID&quot;,&quot;optionLabel&quot;:&quot;Todos&quot;,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/AdInsurance/Emision/Gestion/Movimiento/GetDestinatariosImpresion&quot;,&quot;data&quot;:filterCotizacionSeleccion},&quot;prefix&quot;:&quot;&quot;},&quot;serverFiltering&quot;:true,&quot;filter&quot;:[],&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}}});});
            
          
          
          
            
              Formularios:
            
            
            
          
          
            
              El estado de la p??liza seleccionada no permite impresi??n.
            
          
          
          
            Cancelar
            Imprimir
          
          
        
        
        
      

    
  



  var cantSeleccionados = 0;
  var currentItem;
  var esOpcionRehabilitacion = false;

  var mostrarCols = 0;
  var mostrarFiltrosBasicos = 1;
  var mostrarFiltrosAvanzados = 0;

  const urlVerMovimiento = &quot;/AdInsurance/Emision/Gestion/Movimiento/VerMovimiento&quot;,
   urlNuevoMovimiento = &quot;/AdInsurance/Emision/Gestion/Movimiento/NuevoMovimiento&quot;,
   urlNuevaPropuesta = &quot;/AdInsurance/Emision/Gestion/Movimiento/NuevaPropuesta&quot;,
   urlModificar = &quot;/AdInsurance/Emision/Gestion/Movimiento/Modificar&quot;,
   urlConsultar = &quot;/AdInsurance/Emision/Gestion/Movimiento/VerCotizacion&quot;,
   urlReno = &quot;/AdInsurance/Emision/Gestion/Movimiento/Reno&quot;,
   urlRechazar = &quot;/AdInsurance/Emision/Gestion/Movimiento/Rechazar&quot;,
   urlReplicar = &quot;/AdInsurance/Emision/Gestion/Movimiento/Replicar&quot;,
   urlRenovar = &quot;/AdInsurance/Emision/Gestion/Movimiento/Renovar&quot;,
   urlGetCotizacion = &quot;/AdInsurance/Emision/Gestion/Cotizacion/Get&quot;,
   urlProsperar = &quot;/AdInsurance/Emision/Gestion/Movimiento/Prosperar&quot;,
   urlConsultaAsegurado = &quot;/AdInsurance/Emision/Gestion/AseguradoAP&quot;,
   urlConsultaNomina = &quot;/AdInsurance/Emision/Gestion/NominaAP&quot;,
   urlConsultaCobranza = &quot;/AdInsurance/Emision/Gestion/Poliza/ConsultaCobranza&quot;,
   urlConsultaPoliza = &quot;/AdInsurance/Emision/Gestion/Poliza/PolizaLog&quot;,
   urlConsultaBitacora = &quot;/AdInsurance/Emision/Gestion/CotizacionBitacora&quot;,
   urlConsultaCotizacion = &quot;/AdInsurance/Emision/Gestion/Movimiento/CotizacionLog&quot;,
   urlConsultaNotificacion = &quot;/AdInsurance/Emision/Gestion/Movimiento/NotificacionLog&quot;,
   urlConsultaMarcaGestion = &quot;/AdInsurance/Emision/Infraestructura/MarcaGestionAsignacion&quot;,
   urlConsultaDeclaracionViaje = &quot;/AdInsurance/Emision/Gestion/DeclaracionViajeTransporte&quot;,
   urlConsultaCertificado = &quot;/AdInsurance/Emision/Infraestructura/Certificado&quot;,
   urlBaseEndoso = &quot;/AdInsurance/Emision/Gestion/Movimiento/&quot;,
   urlVerQuery = '/AdInsurance/Emision/Gestion/Movimiento/VerXmlConsultaMovimientoQuery',
   urlReasignar = '/AdInsurance/Emision/Gestion/Movimiento/Reasignar',
   urlRedistribuir = '/AdInsurance/Emision/Gestion/Movimiento/Redistribuir',
   urlObtenerListaDatoPropuesta = '/AdInsurance/Emision/Gestion/Movimiento/ObtenerListaDatoPropuesta',
   urlAccionesInvalidasMenuCotizacion = '/AdInsurance/Emision/Gestion/Movimiento/AccionesInvalidasMenuCotizacion',
   urlVisualizar = '/AdInsurance/Emision/Gestion/Movimiento/Visualizar',
   urlConsultaSiniestro = '/AdInsurance/Emision/Gestion/Siniestro';

  var procAnulacionId = 5;
  var procProrrogaId = 6;
  var procEndosoId = 4;
  var procPolizaNuevaId = 1;
  var procRenovacionId = 2;

  var idEstadoCotizacionRechazada = 13;
  var idEstadoCotizacionIncompleta = 6;
  var idEstadoPolizaAnulada = 2;
  var codigoEstadoVigente = 'V';

  var tipoValorFecha = 'FECHA';
  var tipoValorLogico = 'LOGICO';
  var tipoValorDecimal = 'DECIMAL';
  var tipoValorEntero = 'ENTERO';

  var mensajeSinRegistros = &quot;No se encontraron registros para los filtros especificados.&quot;;

  var tokenFrom = &quot;FROM&quot;;
  var tokenTo = &quot;TO&quot;;

  var cantidadBatchRedistribucion = 100;

  var nombreVariableQueryId = &quot;NOROWSQUERYID&quot;;
  var nombreVariableElapsedTime = &quot;QUERYELAPSEDTIME&quot;;

  var lblInfoConsultaQueryDebug = $(&quot;#lblInfoConsultaQueryDebug&quot;);
  var lblInfoConsultaDebug = $(&quot;#lblInfoConsultaDebug&quot;);
  var icnConsultaDebug = $(&quot;#icnConsultaDebug&quot;);
  var lnkConsultaDebug = $(&quot;#lnkConsultaDebug&quot;);
  var hdnQueryConsulta = $(&quot;#hdnQueryId&quot;);

  $(document).ready(function () {
      //seteo inicial paneles y secciones
      $(&quot;#divProgress&quot;).css(&quot;display&quot;, &quot;none&quot;);

      $($(&quot;.btn-primary&quot;)[0]).css(&quot;display&quot;, &quot;none&quot;);
      $(&quot;.k-pager-info&quot;).before($(&quot;#cantSeleccionados&quot;));

      $(&quot;#tblDatosClave&quot;).addClass(&quot;hidden&quot;);
      $(&quot;#lnkOcultarDatosClave&quot;).addClass(&quot;hidden&quot;);
      $(&quot;#btnShowMoreColumns&quot;).addClass(&quot;hidden&quot;);
      $(&quot;#alertPanelUnlock&quot;).addClass(&quot;hidden&quot;);

    if (mostrarFiltrosBasicos != 1)
      mostrarOcultarPanel(null, 'tblFiltrosBasicos');
    else
      cambiarEstadoBotonPanel('lnkPanelFiltrosBasicos');
    if(mostrarFiltrosAvanzados != 1)
      mostrarOcultarPanel(null, 'tblFiltrosAvanzados');
    else
      cambiarEstadoBotonPanel('lnkPanelFiltrosAvanzados');
    if(mostrarCols != 1)
      mostrarOcultarPanel(null, 'tblColumnas');
    else
      cambiarEstadoBotonPanel('lnkPanelColumnas');

      //Se agrega para mostrar mensaje de grilla vacia al inicio
      $(&quot;#grdConsultaMovimiento&quot;).data(&quot;kendoGrid&quot;).dataSource.data([]);

      //Modo selecci??n
      $(&quot;#lnkSeleccionar&quot;).on(&quot;click&quot;, function (e) {        
        let grid = $(&quot;#grdConsultaMovimiento&quot;).data(&quot;kendoGrid&quot;);
        let data = grid.dataSource.data();
        let selectedIds = [];

        $.each(data, function (i, row) {
            if (row.Seleccionado) {
              selectedIds.push(row.CotizacionId);
            }
        });


        console.log(&quot;Selected Rows: &quot; + selectedIds.join(&quot;, &quot;));
        let url;
        if (&quot;&quot; != &quot;&quot;) {
            url = &quot;/AdInsurance/Emision/Movimiento/ConsultaMovimientos&quot; + &quot;?cotizacionesIds=&quot; + selectedIds.join(&quot;, &quot;);
            if (&quot;&quot; != &quot;&quot;) {
                //se cierra esta pesta??a y se recarga la pesta??a del abm si sigue abierta
                url += &quot;&amp;procesoMasivoId=&quot; + &quot;&quot;;
                if (window.opener != null) {
                    var urlUpdate = &quot;/AdInsurance/Emision/Infraestructura/ProcesoMasivo/Update&quot;;
                    if (window.opener.location.pathname == urlUpdate) {
                        window.opener.ShowLoaderAbm();
                        window.opener.location.href = url;
                        window.close();
                        return;
                    }
                }
                showMessage(&quot;No se guardaron los datos, se cerr?? la ventana principal&quot;);
                return false;
            }
        }
        else
          url = &quot;/AdInsurance/Emision/Gestion/Movimiento/ConsultaMovimientos&quot; + &quot;?cotizacionesIds=&quot; + selectedIds.join(&quot;, &quot;);
        customOpenWindowMovimiento(url);
      })

      $(&quot;#grdConsultaMovimiento&quot;).kendoTooltip({
        filter: &quot;#UsuarioDistribucionDescripcion&quot;,
        position: &quot;top&quot;,
        content: function (e) {
            var dataItem = $(&quot;#grdConsultaMovimiento&quot;).data(&quot;kendoGrid&quot;).dataItem(e.target.closest(&quot;tr&quot;));

            return dataItem.UsuarioDistribucionId;
        },
      }).data(&quot;kendoTooltip&quot;);
  });

  $(document).keypress(function (e) {
    if ($(&quot;#modalSeleccionCotizacionConsulta&quot;).hasClass('in') &amp;&amp; (e.keycode == 13 || e.which == 13)) {
      $(&quot;#btnMostrarQueryConsulta&quot;).click();
    }
  });


  $(&quot;#txtCotizacionConsultaId&quot;).on(&quot;focus&quot;, function () {
    var input = $(this);
    clearTimeout(input.data(&quot;selectTimeId&quot;)); //stop started time out if any

    var selectTimeId = setTimeout(function () {
      input.select();
    });

    input.data(&quot;selectTimeId&quot;, selectTimeId);
  }).blur(function (e) {
    clearTimeout($(this).data(&quot;selectTimeId&quot;)); //stop started timeout
  });


  function getViewModel() {
      return {
          ConsultaMovimientoViewModel: $('form').serializeObject()
      };
  }

  function getConsultaViewModel() {
    //Obtener ordenamiento actual de la grilla
    let grid = $(&quot;#grdConsultaMovimiento&quot;).data(&quot;kendoGrid&quot;);
    let currentSort = grid.dataSource.sort();

    let colsOrderBy = [];
    $.each(currentSort, function (i, item) {
      colsOrderBy.push(item.field + &quot; &quot; + item.dir);
    });

    $(&quot;#ColumnasOrderBy&quot;).val(colsOrderBy.join(', '));

    let viewModel = $('form').serializeObject();

    return {
      ConsultaMovimientoViewModel: viewModel
    }
  }



  
    
      ??
    
    
      
      
        La b??squeda super?? la cantidad de registros default, el resultado se limit?? a 200 registros...
      
    
    
      
        
        Desbloquear l??mite
      
    
  
  







                
              
            

            
          
        
        
      
    
  

  
            var ocultarDatosClaveText = 'Ocultar filtros';
            var mostrarDatosClaveText = 'Filtros';
            var showKeyValues = '1';
            var showTopHeaderBar = '1';
            var disableContentControls = '0';
            var disableKeyControls = '0';
            var execShowHideFilters = '1';
            var showLoading = '1';
            var gridName = 'grdConsultaMovimiento';
            var sessionKey = 'Emmsa.AdInsurance.Emision.Areas.Gestion.Controllers.MovimientoController';
            var title = 'Consulta de movimientos';
            var showBackButton = '1';
            var backDescription = '';
            var backGroupName = '';
            var showButtonTextFilters = '1';
            /* &quot;collectUrlForBackButton&quot;: Se utiliza en el _BaseLayout.js para determinar si se debe almacenar la URL o no en la pagina a la que se est?? ingresando.
               Hacerlo, permite que luego se pueda, mediante al backButton, volver a la misma. */
            var collectUrlForBackButton = '1';

            function getViewModel() {
                if (typeof(take) != &quot;undefined&quot;) {
                    return {
                             ConsultaMovimientoViewModel: $('form').serializeObject(),
                        Take: take
                    };
                } else {
                    return {
                             ConsultaMovimientoViewModel: $('form').serializeObject(),
                    };
                }
            }

  
  

    
        var isGenerated = '0';
        var enableClientRefresh = '1';
    

    

  

  
    
  

  
        var enableGridDblClick = '0';

        var updateUrl = '/AdInsurance/Emision/Gestion/Movimiento/Update/__Id__';
        var removeUrl = '/AdInsurance/Emision/Gestion/Movimiento/Remove/__Id__';
        var replicarUrl = '/AdInsurance/Emision/Gestion/Movimiento/Create/__Id__';

        var take = 200;

        $('#btnLimpiarFiltros').removeClass('hidden');
  

  





SeleccioneMeridional Seguros [1]Assekuransa [83]No se encontraron datos.SeleccioneLa Meridional [1]No se encontraron datos.SeleccioneCasa Central [1]Tierra del Fuego [4]No se encontraron datos.SeleccioneTelef??nica [1]Agencia Casa Central [6]Agencia Mar del Plata [8]Agencia Cordoba [9]Agencia Santa Fe [10]Agencia Mendoza [11]Agencia Tucuman [12]Agencia Tandil [13]Agencia Belgrano [14]Agencia San Isidro [15]Agencia Lomas de Zamora [16]Agencia Bahia Blanca [17]Agencia Neuquen [18]Agencia Oeste [19]Agencia Banco Satander Rio [20]No se encontraron datos.TodosAccidentes personales [2]Cauci??n [1]Inmuebles [4]No Definido [46]Ramas Simples [5]Registro [6]Transporte [7]Veh??culos [3]No data found.TodosACCIDENTES PERSONALES [2]Aeronavegaci??n [306]Aeronavegaci??n Casco [348]Ambiental [355]Autos [349]CALDERAS Y MAQUINARIAS- Activo [252]CAUCION [1]COBERTURA COMPLEMENTARIA DE [236]COMBINADO FAMILIAR/FIRE- Ac [271]Construcci??n [328]D&amp;O y P.I.INSTITUCIONES-Act [279]Embarcaciones [329]EMBARCACIONES PLACER- REAS-Act [277]Energia [391]Entretenimientos [406]EXCESS CASUALTY -REASEG-Activo [276]GARANTIA DE ADM. DE SOCIEDA [240]Garantias extendidas [394]Hogar [373]INTEGRAL DE COMERCIO- Activ [272]Integrales [389]Lineas Financieras [327]Moto Vehiculos [350]Property [390]Responsabilidad Civil [330]RESPONSABILIDAD CIVIL- Activo [264]Responsabilidad Civil TestL [284]Riesgos Varios [307]Salud [356]Seguro T??cnico [354]SEGURO TECNICO - Const/Mont [225]Sepelio Colectivo [353]test 123 [204]Transporte de Mercader??as [326]Travel [352]Vida Colectivo [820]Vida Individual [402]Vida Obligatorio [949]Vida Obligatorio - Test [24]01- INCENDIO [205]01- Transporte PruebaX [286]02- TRANSPORTES [206]03- AERONAVEGACION-CASCOS [207]04- Autom??viles [208]05- CRISTALES [209]06- ROBO [210]08- RESPONSABILIDAD CIVIL [44]09- COMBINADO FAMILIAR [212]10- FIDELITY [213]11- AUTOMOTORES COMERCIAL [214]14- AUTOS COMERCIALES [215]15- LINEAS FINANCIERAS D&amp;O [216]16- LINEAS FINANCIERAS P.I. [217]17- VIDA OBLIGATORIO [3]18- VIDA COLECTIVO [218]19- SEGURO TECNICO [84]20- CALDERAS Y MAQUINARIAS [219]21- INTEGRAL DE CONSORCIOS [220]22- CASCOS [221]23- TRANSITO TERRESTRE [222]24- COMBINADO FAMILIAR/FIRE [223]25- INTEGRAL DE COMERCIO [224]27- INCENDIO (OIL AND PETROL) [226]28- INCENDIO (Chemicals) [227]29- SEGURO DE REPARACIONES [125]30- MULTIRIESGO [228]31- INCENDIO (UTILITIES) [229]32- ENTRETENIMIENTOS [230]33- AMBIENTAL [231]34- MALA PRAXIS MEDICA [232]35- RIESGOS ESPECIALES [233]36- AERONAVEGACION PASAJEROS [234]37- A.R.T. [235]40- EXCESS CASUALTY [237]41- ACC. DEL TRABAJO [238]42- EMBARCACIONES DE PLACER [239]44- GARANTIAS EXTENDIDAS [241]45- D &amp; O y P.I. INSTITUCIONES [242]47- TRAVEL - SEGURO DE VIAJES [244]48- MOTOVEHICULOS [245]49- MARINE LIABILITY [246]51- INCENDIO- Activo [248]52- TRANSPORTES- Activo [249]53- AERONAVEGACION- Activo [250]54- ROBO -Activo [251]56- C.A.R. Y E.A.R. [253]57- OIL AND PETROL- Activo [254]58- CHEMICAL- Activo [255]59- UTILITIES- Activo [256]60- CASCOS- Activo [257]61- TRANSITO TERRESTRE- Activo [258]62- FIDELITY- Activo [259]63- D &amp; O- Activo [260]64- P.I.- Activo [261]65- CAUCION- Activo [262]68- ENTRETENIMIENTOS- Activo [265]69- AMBIENTAL- Activo [266]70- MALA PRAXIS MEDICA- Activo [267]72- A.R.T. Activo [269]76- C.A.R. Y E.A.R.- Activo [273]78- REASEG. ACTIVO MARINE LIAB [275]90- MULTIRIESGO- Activo [280]No data found.TodosActividad [810]Aduaneras [813]Alquileres [816]Cauci??n [1]Concesiones [815]Contractuales [809]Impositivas [814]Judiciales [812]Tenencia [811]No data found.Todos C??lculo con error [17] Emitida [14] En autorizacion [9] En inspecci??n [8] Incompleta [6] Presupuestada [7] Presupuestada con validaciones autorizables [15] Presupuestada con validaciones criticas [16] Propuesta aceptada [4] Propuesta anulada [2] Propuesta emitida [18] Propuesta en espera [1] Propuesta incompleta [19] Propuesta ingresada [5] Propuesta rechazada [3] Rechazada [13]No data found.TodosPesos [1]Dolar USA [2]Euro [3]Reales [101]Libra Esterlina [122]Yenes [126]Rupias [127]Lumpenes [128]milqui [148]Bitcoins [149]Moneda.3 [150]SHEKEL [170]Esquel [171]PRUEBA X [191]Dogecoin [192]Mate [193]Morlacos [194]IVICOIN [214]Vaso [215]milis [216]Oro [218]Danicoins [219]Minerva [220]centavos [221]bitpesos [222]MINERVA [223]walle [243]FIRULIS [244]pesos nacho [263]ludocoin [283]Eva01 [284]No data found.No data found.TodosCedula de Identidad Policia Federal [1]Codigo Unico de Identificacion Laboral [7]Codigo Unico de Identificacion Tributaria [2]Cuit Externo [16]Documento Nacional de Identidad [6]Pasaporte [5]No data found.TodosAFGANISTAN [89]ALEMANIA [10]ANGOLA [94]ANGUILLA [38]ANTIGUA Y BARBUDA [39]ARABIA SAUDITA [90]ARGENTINA [1]ARUBA [40]AUSTRIA [77]BAHAMAS [41]BARBADOS [42]BELGICA [78]BELICE [25]BERMUDAS [32]BOLIVIA [3]BOSNIA-HERZEGOVINA [68]BRASIL [8]CANADA [33]CHILE [5]CHINA [14]COLOMBIA [34]COREA DEL NORTE [11]COREA DEL SUR [84]COSTA DE MARFIL [95]COSTA RICA [26]CROACIA [80]CUBA [43]CURACAO [44]DOMINICA [45]DOMINICANA, REPUBLICA [46]ECUADOR [20]EE.UU. [19]EGIPTO [96]EL SALVADOR [27]ESPA??A [6]ETIOPIA [69]EXTERIOR (Migraci??n) [121]FRANCIA [12]GRANADA [47]GRECIA [81]GUADALUPE [48]GUATEMALA [28]GUAYANA FRANCESA [21]GUYANA [22]HAITI [49]HONDURAS [29]IRAN [65]IRAQ [70]IRLANDA [82]ISLAS CAIMAN [50]ISLAS TURCAS Y CAICOS [51]ISLAS VIRGENES AMERICANAS [52]ISLAS VIRGENES BRIT??NICAS [53]ITALIA [4]JAMAICA [54]JAPON [13]LIBANO [17]LIBIA [86]MARRUECOS [97]MARTINICA [55]MEXICO [36]MONTSERRAT [56]MYANMAR, BIRMANIA [35]NICARAGUA [30]NIGERIA [98]OTROS PA??SES DE AFRICA [64]OTROS PAISES DE ASIA [73]OTROS PAISES DE EUROPA [79]PAISES BAJOS, HOLANDA [83]PAKISTAN [71]PANAMA [31]PARAGUAY [2]PERU [7]POLONIA [9]PUERTO RICO [57]REINO UNIDO [85]REPUBLICA DEL CONGO [76]REPUBLICA DEMOCRATICA DEL CONGO&quot; [75]RUSIA [91]SAINT MAARTEN [62]SAN BARTOLOME [58]SAN CRISTOBAL Y NEVIS [59]SAN PEDRO Y MIQUELON [37]SAN VICENTE Y LAS GRANADINAS [60]SANTA LUCIA [61]SERBIA [72]SIRIA [16]SUDAN [66]SUDAN DEL SUR [67]SUIZA [87]SURINAM [23]TAIWAN [15]TRINIDAD Y TOBAGO [63]TUNEZ [74]TURQUIA [92]UCRANIA [88]URUGUAY [24]VENEZUELA [18]VIETNAM [93]No data found.TodosNo data found.No data found.Todos  Web Api - Gesti??n de movimientos [6] Manual [1] Migracion [5] Proceso autom??tico [2] Proceso masivo [3] Solicitud de cotizaci??n [4]No data found.Todos Anulaci??n [5] Endoso [4] P??liza Nueva [1] Pr??rroga [6] Renovaci??n [2]No data found.TodosLa Meridional [1]No data found.TodosNo data found.TodosNo data found.TodosLocal [1]AIG [2]Fairfax [3]No data found.Todos2.11.1.0 - Contractuales [768]2.11.2.0 - Actividad [769]2.11.4.0 - Judiciales [770]2.11.8.0 - Alquileres [771]2.11.X.X - General [1]No data found.TodosPRODUCTORES CAPITAL [1]PRODUCTORES INTERIOR [2]BROKERS [3]BANCOS [5]SPONSORS [6]DIRECTOS [8]TEST [9]No data found.TodosNo data found.TodosACTIVIDAD O PROFESI??N [33]AGENCIA DE LOTER??A [32]AGENCIAS DE TURISMO [31]Alimentos [2190]ANT. POR ACOPIO DE MATERIALES [4]Anticipo Beneficios [972]ANTICIPO FINANCIERO [3]CONTRACAUTELA JUDICIAL [20]DIFERENCIA DE DERECHOS [18]DIRECTORES Y ADM. DE EMPRESAS [30]EJECUCI??N DE CONTRATO [2]EXPORTACI??N TEMPORARIA [17]FALTA DE DOCUMENTACI??N [14]GARANT??A CORREDORES INMOBILIARIOS C.A.B.A. [36]GARANT??A DE ADJUDICACI??N [7]GARANT??A DE ANTICIPO  [8]GARANT??A DE INSCRIPCI??N [34]GARANT??A DE OFERTA [6]GARANTIA DE OFERTA-CONCESIONES [24]GARANT??A DE VERACIDAD [26]GARANT??A MIEMBROS COMISIONES DIRECTIVAS [35]GTIA. CUMPLIMIENTO DE CONTRATO [25]GTIA. DE ALQ. COMERCIALES [22]GTIA. DE ALQ. PARTICULARES [23]GTIA. TRANSIT. POR DIF. DE IMP [27]HABILITACI??N DE DEP. FISCAL [19]IMPORTACI??N TEMPORARIA [16]MANTENIMIENTO DE OFERTA [1]MARTILLEROS Y REMATADORES [28]Martin 01 [562]Producto de prueba [1299]Producto de prueba de HS para Caucion [912]prueba [1036]PRUEBA [873]Prueba QA [2005]REINTEGRO IMPOSITIVO [15]RES. 1102/04-SEC. DE ENERG??A [29]SUST. FONDO DE REPARO EN OBRA [5]SUSTIT. DE MEDIDAS CAUTELARES [21]SUSTITUCI??N DE FONDO DE REPARO [9]TENENCIA MAT. P/FAB. O MONTAJE [11]TENENCIA P/USO-REP-MANUT-REAC. [10]TENENCIA-CERT. AVANCE DE OBRA [12]TR??NSITO TERRESTRE [13]No data found.TodosNo data found.Todos9 Meses [9]Abierta (Prga. Anual) [18]Abierta (Prga. Bimestral) [20]Abierta (Prga. Cuatrimestral) [22]Abierta (Prga. Mensual) [19]Abierta (Prga. Semestral) [23]Abierta (Prga. Trimestral) [21]Anual [3]Bimestral [16]Cuatrimestral [2]Cuatrimestral (2 Prgas) [4]Irregular [7]Mensual [5]Mensual (11 prgas) [6]Semestral [1]Semestral (1 Prorroga) [8]Trienal  [45]Trienal (Prga. Anual) [17]Trienal (Prga. Bimestral) [11]Trienal (Prga. Cuatrimestral) [13]Trienal (Prga. Mensual) [10]Trienal (Prga. Semestral) [14]Trienal (Prga. Trimestral) [12]Trimestral [15]Trimestral (3 prorrogas) [44]Vigencia abierta - 100 [46]vigencia con V/negativo [24]No data found.TodosAMERICAN EXPRESS [3]AMERICAN EXPRESS AUTOS [32]AMEX AUTO C/COMISION [25]AMEX HOGAR C/COMISION [26]AMEX PROTECCION EN MOVIMIENTO [31]BANCO COMAFI [36]BANCO INTERFINANZAS [22]BANCO LA PAMPA [18]Banco Prueba [89]CABAL [9]CARREFOUR [34]CENCOSUD MASTERCARD [37]CLIPER [14]CMR-FALABELLA [29]CUPON [39]DEB.BCO.SANTANDER RIO SEG.INT. [13]DEBITO BCO SANTANDER RIO [11]DEBITO DIRECTO [17]DINERS [19]ELEBAR [15]FORD PLAN OVALO [27]forma de pago prueba [203]Forma de pago Quarent [263]forma de pago test [183]FORPAG BANCO PRUEBA [85]FP prueba final [143]ICBC - CAJA DE AHORRO [5]ICBC - Cuenta Corriente [6]ICBC PRENDARIOS [21]ITALCRED [20]ITALCRED ALEA [24]MASTERCARD [4]MERCADO PAGO [30]MUTUAL SIEMENS [10]NATIVA MASTER [33]NATIVA VISA [28]PAGO FACIL [41]PAGO NORMAL [1]pago test [264]PRB10102019 FORPAG [123]PRENDARIOS BCO. SANTANDER RIO [12]PRUEBA DE ABM DE ForPag [84]PRUEBA DE ABM DE FORPAG [88]RAPIPAGO [82]T.FALABELLA [7]Tarjeta LILI [266]TARJETA NARANJA [8]TARJETA NARANJA HOGAR [35]TARJETA NARANJA MAPP [38]TARJETA NEVADA [16]Testing [223]Tranferencia bancaria test [265]VISA [2]No data found.TodosAP-BBVA MIGRACION EMMA [31]AP-C&amp;B MIGRACION EMMA [42]AP-CAREFFOUR MIGRACION EMMA [39]AP-CARTA AUTOMATICA MIGRACION EMMA [41]AP-CARTA SUR MIGRACION EMMA [26]AP-CFA MIGRACION EMMA [36]AP-CLIPER MIGRACION EMMA [37]AP-COMAFI MIGRACION EMMA [32]AP-DTC MIGRACION EMMA [24]AP-ELEBAR MIGRACION EMMA [40]AP-ICBC MIGRACION EMMA [29]AP-ITALCRED MIGRACION EMMA [38]AP-NEVADA MIGRACION EMMA [35]AP-READERS MIGRACION EMMA [34]AP-RIO MIGRACION EMMA [30]AP-SEGPOOL MIGRACION EMMA [27]AP-SIN MOVIL MIGRACION EMMA [23]AP-SPRAYETTE MIGRACION EMMA [33]AP-T.NARANJA MIGRACION EMMA [28]AP-UOL MIGRACION EMMA [25]Grupo Afinidad 1 [1]Grupo Afinidad 2 [2]test [43]No data found.TodosAMEX 37% [420]BBVA AP+ [216]BO+CONTAR_23% [424]BOLSO+CALLLM_ 21% [422]BOLSO+CALLLM_ 23%  [423]BOLSO+CONTAR_25% [425]C&amp;B AP+ [234]CARREFOUR (15) AP+ [230]CARREFOUR (30) AP+ [229]CARTA AUTOMATICA AP+ [233]CARTA SUR AP+ [209]CFA AP+ [225]CITI-SANTANDER 27% [441]CITI-SANTANDER2-22% [442]CLIPER AP+ [226]COMAFI (28) AP+ [217]COMAFI (32) AP+ [218]DTC (B) AP+ [232]DTC AP+ [206]DTC TP AP+ [205]DTC(EXUSINA) AP+ [235]ELEBAR AP+ [231]FERREIRA AP+ [208]ICBC AP+ [213]ITALCRE (25) AP+ [228]ITALCRE (30) AP+ [227]NEVADA(TN 25) AP+ [223]NEVADA(TN 28) AP+ [224]Plan Abierto [2]plan abierto para cualquier ramo [356]Plan Cerrado Dic [416]Plan comercial 2 [3]Plan comercial 3 [43]Plan comercial Cetrogar 14% [448]Plan Comercial distribuci??n por Puntos [417]PlanComercial23 [419]Prueba plan comercial [336]Pruebas QA [440]READERS AP+ [222]Responsabilidad Civil General [418]S.RIO (30) AP+ [214]S.RIO (35) AP+ [215]SEGPOOL AP+ [210]SIN MOVIL AP+ [204]SPRAYETTE (20) AP+ [221]SPRAYETTE (23) AP+ [219]SPRAYETTE (23B) AP+ [220]SPRAYETTE-23% [421]T.NARANJA (1) AP+ [211]T.NARANJA AP+ [212]TOPE 20% - AUTOS  [464]Transporte General [443]UOL AP+ [207]No data found.Todos1 Cuota-Contado [1]10 Cuotas [10]11 Cuotas [11]12 Cuotas [12]13 Cuotas [13]2 Cuotas [2]3 Cuotas [3]4 Cuotas [4]5 Cuotas [5]6 Cuotas [6]7 Cuotas [7]8 Cuotas [8]9 Cuotas [9]No data found.102050100No data found.TodosNo data found.TodosTodosSeleccioneACCIDENTES PERSONALES [2]Aeronavegaci??n [306]Aeronavegaci??n Casco [348]Ambiental [355]Autos [349]CALDERAS Y MAQUINARIAS- Activo [252]CAUCION [1]COBERTURA COMPLEMENTARIA DE [236]COMBINADO FAMILIAR/FIRE- Ac [271]Construcci??n [328]D&amp;O y P.I.INSTITUCIONES-Act [279]Embarcaciones [329]EMBARCACIONES PLACER- REAS-Act [277]Energia [391]Entretenimientos [406]EXCESS CASUALTY -REASEG-Activo [276]GARANTIA DE ADM. DE SOCIEDA [240]Garantias extendidas [394]Hogar [373]INTEGRAL DE COMERCIO- Activ [272]Integrales [389]Lineas Financieras [327]Moto Vehiculos [350]Property [390]Responsabilidad Civil [330]RESPONSABILIDAD CIVIL- Activo [264]Responsabilidad Civil TestL [284]Riesgos Varios [307]Salud [356]Seguro T??cnico [354]SEGURO TECNICO - Const/Mont [225]Sepelio Colectivo [353]test 123 [204]Transporte de Mercader??as [326]Travel [352]Vida Colectivo [820]Vida Individual [402]Vida Obligatorio [949]Vida Obligatorio - Test [24]01- INCENDIO [205]01- Transporte PruebaX [286]02- TRANSPORTES [206]03- AERONAVEGACION-CASCOS [207]04- Autom??viles [208]05- CRISTALES [209]06- ROBO [210]08- RESPONSABILIDAD CIVIL [44]09- COMBINADO FAMILIAR [212]10- FIDELITY [213]11- AUTOMOTORES COMERCIAL [214]14- AUTOS COMERCIALES [215]15- LINEAS FINANCIERAS D&amp;O [216]16- LINEAS FINANCIERAS P.I. [217]17- VIDA OBLIGATORIO [3]18- VIDA COLECTIVO [218]19- SEGURO TECNICO [84]20- CALDERAS Y MAQUINARIAS [219]21- INTEGRAL DE CONSORCIOS [220]22- CASCOS [221]23- TRANSITO TERRESTRE [222]24- COMBINADO FAMILIAR/FIRE [223]25- INTEGRAL DE COMERCIO [224]27- INCENDIO (OIL AND PETROL) [226]28- INCENDIO (Chemicals) [227]29- SEGURO DE REPARACIONES [125]30- MULTIRIESGO [228]31- INCENDIO (UTILITIES) [229]32- ENTRETENIMIENTOS [230]33- AMBIENTAL [231]34- MALA PRAXIS MEDICA [232]35- RIESGOS ESPECIALES [233]36- AERONAVEGACION PASAJEROS [234]37- A.R.T. [235]40- EXCESS CASUALTY [237]41- ACC. DEL TRABAJO [238]42- EMBARCACIONES DE PLACER [239]44- GARANTIAS EXTENDIDAS [241]45- D &amp; O y P.I. INSTITUCIONES [242]47- TRAVEL - SEGURO DE VIAJES [244]48- MOTOVEHICULOS [245]49- MARINE LIABILITY [246]51- INCENDIO- Activo [248]52- TRANSPORTES- Activo [249]53- AERONAVEGACION- Activo [250]54- ROBO -Activo [251]56- C.A.R. Y E.A.R. [253]57- OIL AND PETROL- Activo [254]58- CHEMICAL- Activo [255]59- UTILITIES- Activo [256]60- CASCOS- Activo [257]61- TRANSITO TERRESTRE- Activo [258]62- FIDELITY- Activo [259]63- D &amp; O- Activo [260]64- P.I.- Activo [261]65- CAUCION- Activo [262]68- ENTRETENIMIENTOS- Activo [265]69- AMBIENTAL- Activo [266]70- MALA PRAXIS MEDICA- Activo [267]72- A.R.T. Activo [269]76- C.A.R. Y E.A.R.- Activo [273]78- REASEG. ACTIVO MARINE LIAB [275]90- MULTIRIESGO- Activo [280]No data found.Seleccione5101525No data found.SeleccioneEquipo Emisor AP [21]Equipo Emisor Autos e Inmuebles [41]Equipo Emisor Caucion [1]Equipo Emisor Hogar [103]Equipo Emisor Ramas Simples [22]EQUIPO INCENDIO [81]Equipo Suscripci??n AP [105]Equipo Suscriptor Hogar [102]Equipo Suscriptor Ramas Varias (Tipo Operaci??n Modificaci??n) [23]Equipo Suscriptores Autos e Inmuebles [61]Equipo Suscriptores Caucion [2]Equipo_Emisor_Transporte [104]EQUIPOS SEG_TEC [101]No data found.SeleccioneConsultarModificarEndosarProrrogarAnularRehabilitarExportarRenovarReplicarProsperarImprimirConsultasCobranzasN??minasAseguradosLog de estadosLog de p??lizaLog de bit??coraLog de notificacionesMarcas de gesti??nDeclaraciones de viajeEmisi??n de certificadosConsulta de siniestrosTodosNo data found.id(&quot;grdConsultaMovimiento&quot;)/table[1]/tbody[1]/tr[1]/td[@class=&quot;k-command-cell&quot;]/a[@class=&quot;k-button k-button-icontext k-grid-Mostrarmen?? k-font-icon&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;k-webkit k-webkit100&quot;]/body[@class=&quot;skin-green custom-skin sidebar-collapse sidebar-mini&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
</WebElementEntity>
