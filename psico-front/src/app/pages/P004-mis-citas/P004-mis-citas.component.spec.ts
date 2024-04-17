/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { P004MisCitasComponent } from './P004-mis-citas.component';

describe('P004MisCitasComponent', () => {
  let component: P004MisCitasComponent;
  let fixture: ComponentFixture<P004MisCitasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ P004MisCitasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(P004MisCitasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
