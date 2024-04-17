/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { P003CitasComponent } from './P003-citas.component';

describe('P003CitasComponent', () => {
  let component: P003CitasComponent;
  let fixture: ComponentFixture<P003CitasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ P003CitasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(P003CitasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
