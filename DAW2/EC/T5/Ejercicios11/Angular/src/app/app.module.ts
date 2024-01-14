import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { Ej1Component } from './ejs/ej1/ej1.component';
import { Ej2Component } from './ejs/ej2/ej2.component';
import { Ej3Component } from './ejs/ej3/ej3.component';
import { Ej4Component } from './ejs/ej4/ej4.component';
import { Ej5Component } from './ejs/ej5/ej5.component';
import { Ej6Component } from './ejs/ej6/ej6.component';
import { Ej7Component } from './ejs/ej7/ej7.component';
import { Ej8Component } from './ejs/ej8/ej8.component';
import { Ej9Component } from './ejs/ej9/ej9.component';
import { Ej10Component } from './ejs/ej10/ej10.component';
import { Ej11Component } from './ejs/ej11/ej11.component';

@NgModule({
  declarations: [
    AppComponent,
    Ej1Component,
    Ej2Component,
    Ej3Component,
    Ej4Component,
    Ej5Component,
    Ej6Component,
    Ej7Component,
    Ej8Component,
    Ej9Component,
    Ej10Component,
    Ej11Component
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
