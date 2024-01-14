import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ej11Component } from './ej11.component';

describe('Ej11Component', () => {
  let component: Ej11Component;
  let fixture: ComponentFixture<Ej11Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Ej11Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Ej11Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
