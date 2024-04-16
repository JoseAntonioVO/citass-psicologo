/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { UserPsicoService } from './user-psico.service';

describe('Service: UserPsico', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [UserPsicoService]
    });
  });

  it('should ...', inject([UserPsicoService], (service: UserPsicoService) => {
    expect(service).toBeTruthy();
  }));
});
