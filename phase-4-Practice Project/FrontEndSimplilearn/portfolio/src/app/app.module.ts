import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DemoComponentComponent } from './demo-component/demo-component.component';
import {HeaderModuleModule} from './header-module/header-module.module'
import {TestmoduleModule} from './testmodule/testmodule.module';
import { EventsComponent } from './events/events.component';
import { CounterComponent } from './counter/counter.component';
import { IfelseComponent } from './ifelse/ifelse.component';
import { BindingVsInterpolationComponent } from './binding-vs-interpolation/binding-vs-interpolation.component';
import { ElseifComponent } from './elseif/elseif.component';
import { SwitchcaseComponent } from './switchcase/switchcase.component';
import { ForLoopComponent } from './for-loop/for-loop.component';
import { NestedForLoopComponent } from './nested-for-loop/nested-for-loop.component';
import { StyleBindingComponent } from './style-binding/style-binding.component';
import { FormComponent } from './form/form.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AboutUsComponent } from './homepage/about-us/about-us.component';
import { ContactusComponent } from './homepage/contactus/contactus.component';
import { SigninComponent } from './homepage/signin/signin.component';
import { SignupComponent } from './homepage/signup/signup.component';
@NgModule({
  declarations: [
    AppComponent,
    DemoComponentComponent,
    EventsComponent,
    CounterComponent,
    IfelseComponent,
    BindingVsInterpolationComponent,
    ElseifComponent,
    SwitchcaseComponent,
    ForLoopComponent,
    NestedForLoopComponent,
    StyleBindingComponent,
    FormComponent,
    HomepageComponent,
    AboutUsComponent,
    ContactusComponent,
    SigninComponent,
    SignupComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HeaderModuleModule,
    TestmoduleModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
