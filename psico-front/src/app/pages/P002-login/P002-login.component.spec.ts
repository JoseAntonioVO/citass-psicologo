/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { P002LoginComponent } from './P002-login.component';

describe('P002LoginComponent', () => {
  let component: P002LoginComponent;
  let fixture: ComponentFixture<P002LoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ P002LoginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(P002LoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
