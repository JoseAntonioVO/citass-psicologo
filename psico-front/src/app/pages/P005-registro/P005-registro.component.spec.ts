/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { P005RegistroComponent } from './P005-registro.component';

describe('P005RegistroComponent', () => {
  let component: P005RegistroComponent;
  let fixture: ComponentFixture<P005RegistroComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ P005RegistroComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(P005RegistroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
