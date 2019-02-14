import { NgModule } from '@angular/core';
import {Routes , RouterModule} from '@angular/router';
import {ChildComponent} from './child/child.component';


// @ts-ignore
@NgModule({
  exports: [ RouterModule],
  imports : [RouterModule.forRoot(routes)]
})
const routes: Routes = [
  {path: '/child', component: ChildComponent}
];
export class AppRoutingModule {

}
